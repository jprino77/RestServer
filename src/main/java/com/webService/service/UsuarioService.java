package com.webService.service;

import com.webService.entity.UsuarioEntity;

public interface UsuarioService {
	
	void crearOActualizar(UsuarioEntity usuario);
	
	void bajaUsuario(UsuarioEntity usuario);
	
	Boolean existeUsuario(String usuario);
	
	UsuarioEntity EncontrarUsuario(Integer id);
	
}
