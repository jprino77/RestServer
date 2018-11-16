package com.sd.RestServer.service;

import java.util.List;

import com.sd.RestServer.openWeatherMap.response.Clima;

public interface PronosticoService {

	List<Clima> getCiudadesMasConsultadas();

}
