package com.sd.RestServer.service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.sd.RestServer.entity.CiudadEntity;
import com.sd.RestServer.openWeatherMap.response.Clima;
import com.sd.RestServer.repository.PronosticoRepository;

@Service
public class PronosticoServiceImpl implements PronosticoService {

	@Value("${spring.appId}")
	String appId;

	@Value("${spring.appUrl}")
	String appUrl;

	@Autowired
	PronosticoRepository repo;

	@Override
	@Transactional
	public List<Clima> getCiudadesMasConsultadas() {

		List<CiudadEntity> ciudadEntity = repo.findTop5ByOrderByCantidadBuscadaDesc();

		List<Clima> climas = ciudadEntity.stream().map(ciudad -> {
			URL url;
			try {
				url = new URL(appUrl + "id=" + Integer.valueOf(ciudad.getIdCiudad()) + appId);
				InputStreamReader reader = new InputStreamReader(url.openStream());
				return new Gson().fromJson(reader, Clima.class);
			} catch (IOException e) {
				return null;
			}

		}).collect(Collectors.toList());

		return climas;
	}

}
