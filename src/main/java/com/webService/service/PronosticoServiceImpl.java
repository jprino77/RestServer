package com.webService.service;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.webService.entity.CiudadEntity;
import com.webService.openWeatherMap.response.Clima;
import com.webService.openWeatherMap.response.ClimaExtendido;
import com.webService.repository.CiudadRepository;

@Service
public class PronosticoServiceImpl implements PronosticoService {

	@Value("${spring.appId}")
	String appId;

	@Value("${spring.appUrl}")
	String appUrl;

	@Autowired
	CiudadRepository repo;

	@Override
	@Transactional
	public List<Clima> getClimaCiudadesMasConsultadas() {

		List<CiudadEntity> ciudadEntity = repo.findTop5ByOrderByCantidadBuscadaDesc();

		List<Clima> climas = ciudadEntity.stream().map(ciudad -> {
			URL url;
			try {
				url = new URL(appUrl + "weather?id=" + Integer.valueOf(ciudad.getIdCiudad()) + appId);
				InputStreamReader reader = new InputStreamReader(url.openStream());
				return new Gson().fromJson(reader, Clima.class);
			} catch (IOException e) {
				return null;
			}

		}).collect(Collectors.toList());

		return climas;
	}

	@Override
	@Transactional
	public List<Clima> getClimaExtendido(String ciudadId) throws IOException {
		URL url;
		url = new URL(appUrl + "forecast?id=" + ciudadId + appId);
		InputStreamReader reader = new InputStreamReader(url.openStream());
		
		ClimaExtendido climaExt = new Gson().fromJson(reader, ClimaExtendido.class);

		repo.sumarCantidadBuscada(Integer.valueOf(ciudadId));
		
		// Remuevo duplicados el api deveulve pronostico cada 3hs solo me quedo con el
		// primero que encuentro
		return climaExt.getList().stream().collect(collectingAndThen(
				toCollection(() -> new TreeSet<>(Comparator.comparing(Clima::getDt_txt))), ArrayList::new));
	}

}
