package com.webService.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.webService.openWeatherMap.response.Clima;

public interface PronosticoService {

	List<Clima> getClimaCiudadesMasConsultadas();
	
	List<Clima> getClimaExtendido(String ciudadId) throws MalformedURLException, IOException;
	
}
