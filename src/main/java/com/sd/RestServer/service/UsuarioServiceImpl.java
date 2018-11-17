package com.sd.RestServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.RestServer.entity.UsuarioEntity;
import com.sd.RestServer.repository.UsuarioRepository;

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
