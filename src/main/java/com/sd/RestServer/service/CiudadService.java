package com.sd.RestServer.service;

import java.util.List;

import com.sd.RestServer.entity.CiudadEntity;

public interface CiudadService {

	List<CiudadEntity> getCiudadContieneNombre(String nombre);
}
