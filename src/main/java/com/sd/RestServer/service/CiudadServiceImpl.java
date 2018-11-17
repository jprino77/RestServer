package com.sd.RestServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sd.RestServer.entity.CiudadEntity;
import com.sd.RestServer.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements CiudadService {

	@Autowired
	CiudadRepository repo;

	@Override
	@Transactional
	public List<CiudadEntity> getCiudadContieneNombre(String nombre) {
		return repo.findByNombreContainingIgnoreCaseOrderByNombre(nombre);
	}

}
