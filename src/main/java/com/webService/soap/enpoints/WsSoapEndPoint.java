package com.webService.soap.enpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.webService.entity.CiudadEntity;
import com.webService.entity.UsuarioEntity;
import com.webService.service.UsuarioService;
import com.webService.soap.mensajes.AltaRequest;
import com.webService.soap.mensajes.AltaResponse;

@Endpoint
public class WsSoapEndPoint {
	
	@Autowired
	UsuarioService usuarioService;

	private static final String NAMESPACE_URI = "http://www.webService.com/soap/mensajes";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AltaRequest")
	@ResponsePayload
	public AltaResponse alta(@RequestPayload AltaRequest alta) {
		AltaResponse response = new AltaResponse();

		UsuarioEntity usuario = new UsuarioEntity();
		CiudadEntity ciudadEntity = new CiudadEntity();

		usuario.setNombre(alta.getNombre());
		usuario.setClave(alta.getClave());
		usuario.setUsuario(alta.getUsuario());

		ciudadEntity.setIdCiudad(alta.getCiudadId());

		usuario.setCiudad(ciudadEntity);

		usuarioService.crearOActualizar(usuario);

		response.setRespuesta("Exito");

		return response;
	}

}
