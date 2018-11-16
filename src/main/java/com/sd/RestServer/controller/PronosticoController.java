package com.sd.RestServer.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.RestServer.openWeatherMap.response.Clima;
import com.sd.RestServer.service.PronosticoService;

//jprino
// c94094a992687a2978b4f3c474808218
@RestController
@RequestMapping("/clima")
public class PronosticoController {
	
	@Autowired
	PronosticoService pronosticoService;

	@GetMapping("/ciudadesMasConsultadas")
	public ResponseEntity<List<Clima>> climaActual() throws URISyntaxException, IOException {
		List<Clima> climas = new ArrayList<Clima>();
		
		climas = pronosticoService.getCiudadesMasConsultadas();

		if(climas.isEmpty() || climas == null) {
			return new ResponseEntity<List<Clima>>(new ArrayList<Clima>(), HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<Clima>>(climas, HttpStatus.OK);
		}
	}

}
