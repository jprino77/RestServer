package com.webService.rest.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webService.openWeatherMap.response.Clima;
import com.webService.service.PronosticoService;

@RestController
@RequestMapping("/clima")
public class PronosticoController {

	public static final Logger logger = LoggerFactory.getLogger(PronosticoController.class);

	@Autowired
	PronosticoService pronosticoService;

	@GetMapping("/ciudadesMasConsultadas")
	public ResponseEntity<List<Clima>> ciudadesMasConsultadas() throws URISyntaxException, IOException {

		logger.info("ciudadesMasConsultadas");

		List<Clima> climas = new ArrayList<Clima>();

		climas = pronosticoService.getClimaCiudadesMasConsultadas();

		if (climas.isEmpty() || climas == null) {
			return new ResponseEntity<List<Clima>>(new ArrayList<Clima>(), HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Clima>>(climas, HttpStatus.OK);
		}
	}

	@GetMapping("/climaExtendido/{id}")
	public ResponseEntity<List<Clima>> climaExtendido(@PathVariable String id) throws URISyntaxException, IOException {

		logger.info("climaExtendido");

		List<Clima> climas = new ArrayList<Clima>();

		climas = pronosticoService.getClimaExtendido(id);

		if (climas.isEmpty() || climas == null) {
			return new ResponseEntity<List<Clima>>(new ArrayList<Clima>(), HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Clima>>(climas, HttpStatus.OK);
		}
	}

}
