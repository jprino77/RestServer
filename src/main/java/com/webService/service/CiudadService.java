package com.webService.service;

import java.util.List;

import com.webService.entity.CiudadEntity;

public interface CiudadService {

	List<CiudadEntity> getCiudadContieneNombre(String nombre);
}
