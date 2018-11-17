package com.sd.RestServer.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.RestServer.entity.CiudadEntity;
import com.sd.RestServer.openWeatherMap.response.Clima;
import com.sd.RestServer.service.PronosticoService;

@RestController
@RequestMapping("/clima")
public class PronosticoController {
	
	@Autowired
	PronosticoService pronosticoService;

	@GetMapping("/ciudadesMasConsultadas")
	public ResponseEntity<List<Clima>> ciudadesMasConsultadas() throws URISyntaxException, IOException {
		List<Clima> climas = new ArrayList<Clima>();
		
		climas = pronosticoService.getClimaCiudadesMasConsultadas();

		if(climas.isEmpty() || climas == null) {
			return new ResponseEntity<List<Clima>>(new ArrayList<Clima>(), HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<Clima>>(climas, HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/climaExtendido/{id}")
	public ResponseEntity<List<Clima>> climaExtendido(@PathVariable String id) throws URISyntaxException, IOException {
		List<Clima> climas = new ArrayList<Clima>();
		
		climas = pronosticoService.getClimaExtendido(id);

		if(climas.isEmpty() || climas == null) {
			return new ResponseEntity<List<Clima>>(new ArrayList<Clima>(), HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<Clima>>(climas, HttpStatus.OK);
		}
	}
	
	@PostMapping("/buscarCiudad")
	public ResponseEntity<List<CiudadEntity>>  buscarCiudad(@RequestBody String nombre){
		List<CiudadEntity> ciudadEntity = new ArrayList<CiudadEntity>();
		
		if(ciudadEntity.isEmpty() || ciudadEntity == null) {
			return new ResponseEntity<List<CiudadEntity>>(new ArrayList<CiudadEntity>(), HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<List<CiudadEntity>>(ciudadEntity, HttpStatus.OK);
		}
	}

}
