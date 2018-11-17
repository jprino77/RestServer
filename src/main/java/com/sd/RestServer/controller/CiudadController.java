package com.sd.RestServer.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sd.RestServer.entity.CiudadEntity;
import com.sd.RestServer.service.CiudadService;

@RestController
public class CiudadController {

	public static final Logger logger = LoggerFactory.getLogger(CiudadController.class);

	@Autowired
	CiudadService ciudadService;

	@PostMapping("/buscarCiudad")
	public ResponseEntity<List<CiudadEntity>> buscarCiudad(@RequestBody String nombre) throws JSONException {

		logger.info("buscarCiudad" + nombre);

		List<CiudadEntity> ciudadEntity = ciudadService.getCiudadContieneNombre(nombre);

		if (ciudadEntity.isEmpty() || ciudadEntity == null) {
			return new ResponseEntity<List<CiudadEntity>>(new ArrayList<CiudadEntity>(), HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<CiudadEntity>>(ciudadEntity, HttpStatus.OK);
		}
	}

}
