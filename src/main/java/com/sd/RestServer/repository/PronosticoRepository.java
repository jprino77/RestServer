package com.sd.RestServer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.RestServer.entity.CiudadEntity;

@Repository
public interface PronosticoRepository extends CrudRepository<CiudadEntity, Integer>{

	List<CiudadEntity> findTop5ByOrderByCantidadBuscadaDesc();
}
