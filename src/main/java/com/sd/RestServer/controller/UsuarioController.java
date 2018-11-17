package com.sd.RestServer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.RestServer.entity.UsuarioEntity;
import com.sd.RestServer.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	public static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	UsuarioService usuarioService;

	@PostMapping("/alta")
	public ResponseEntity<?> crearUsuario(@RequestBody UsuarioEntity usuario) {

		logger.info("Crear usuario " + usuario.toString());

		if (usuarioService.existeUsuario(usuario.getUsuario())) {
			logger.error("Ya existe Usuario", usuario.getUsuario());

			return new ResponseEntity<>(HttpStatus.CONFLICT);
		} else {
			usuarioService.crearOActualizar(usuario);
		}

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/modificar")
	public ResponseEntity<?> modificar(@RequestBody UsuarioEntity usuario) {

		logger.info("Actualizar Usuario " + usuario.getId());

		if (usuario == null || !usuarioService.existeUsuario(usuario.getUsuario())) {
			logger.error("No existe usuario a modificar");

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		usuarioService.crearOActualizar(usuario);

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/baja/{id}")
	public ResponseEntity<?> borrarUsuario(@PathVariable("id") int id) {
		logger.info("Borrar Usuario" + id);

		UsuarioEntity usuario = usuarioService.EncontrarUsuario(id);
		if (usuario == null) {
			logger.error("No existe usuario." + id);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		usuarioService.bajaUsuario(usuario);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}