package com.sd.RestServer.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.sd.RestServer.openWeatherMap.response.Clima;

public interface PronosticoService {

	List<Clima> getClimaCiudadesMasConsultadas();
	
	List<Clima> getClimaExtendido(String ciudadId) throws MalformedURLException, IOException;
	
}
