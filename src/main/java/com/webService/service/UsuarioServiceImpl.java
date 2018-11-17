package com.webService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webService.entity.UsuarioEntity;
import com.webService.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository repo;

	@Override
	public void crearOActualizar(UsuarioEntity usuario) {
		repo.save(usuario);
	}

	@Override
	public void bajaUsuario(UsuarioEntity usuario) {
		repo.delete(usuario);

	}

	@Override
	public Boolean existeUsuario(String usuario) {
		return (repo.countByUsuario(usuario) > 0) ? true : false;
	}

	@Override
	public UsuarioEntity EncontrarUsuario(Integer id) {
		
		return  repo.findById(id).get();
	}

}
