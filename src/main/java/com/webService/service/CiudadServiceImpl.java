package com.webService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webService.entity.CiudadEntity;
import com.webService.repository.CiudadRepository;

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
