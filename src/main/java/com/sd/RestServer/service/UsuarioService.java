package com.sd.RestServer.service;

import com.sd.RestServer.entity.UsuarioEntity;

public interface UsuarioService {
	
	void crearOActualizar(UsuarioEntity usuario);
	
	void bajaUsuario(UsuarioEntity usuario);
	
	Boolean existeUsuario(String usuario);
	
	UsuarioEntity EncontrarUsuario(Integer id);
	
}
