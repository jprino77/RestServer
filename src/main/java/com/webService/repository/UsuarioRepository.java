package com.webService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webService.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Integer> {

	Long countByUsuario(String usuario);
}
