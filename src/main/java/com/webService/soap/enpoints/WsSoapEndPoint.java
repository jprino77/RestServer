package com.webService.soap.enpoints;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.webService.entity.CiudadEntity;
import com.webService.entity.UsuarioEntity;
import com.webService.service.CiudadService;
import com.webService.service.UsuarioService;
import com.webService.soap.mensajes.AltaRequest;
import com.webService.soap.mensajes.AltaResponse;
import com.webService.soap.mensajes.BajaRequest;
import com.webService.soap.mensajes.BajaResponse;
import com.webService.soap.mensajes.Ciudad;
import com.webService.soap.mensajes.Ciudades;
import com.webService.soap.mensajes.CiudadesRequest;
import com.webService.soap.mensajes.CiudadesResponse;

@Endpoint
public class WsSoapEndPoint {

	public static final Logger logger = LoggerFactory.getLogger(WsSoapEndPoint.class);

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	CiudadService ciudadService;

	private static final String NAMESPACE_URI = "http://www.webService.com/soap/mensajes";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AltaRequest")
	@ResponsePayload
	public AltaResponse altaUsuario(@RequestPayload AltaRequest alta) {
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

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "BajaRequest")
	@ResponsePayload
	public BajaResponse bajaUsuario(@RequestPayload BajaRequest baja) {
		BajaResponse response = new BajaResponse();

		logger.info("Borrar Usuario" + baja.getIdUsuario());

		UsuarioEntity usuario = usuarioService.EncontrarUsuario(baja.getIdUsuario());
		if (usuario == null) {
			logger.error("No existe usuario." + baja.getIdUsuario());

			response.setRespuesta("No existe usuario." + baja.getIdUsuario());
			return response;
		}

		usuarioService.bajaUsuario(usuario);

		response.setRespuesta("Exito");

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CiudadesRequest")
	@ResponsePayload
	public CiudadesResponse buscarCiudades(@RequestPayload CiudadesRequest request) {
		CiudadesResponse response= new CiudadesResponse();

		List<Ciudad> ciudadList;
		
		Ciudades ciudades = new Ciudades();

		List<CiudadEntity>entity=ciudadService.getCiudadContieneNombre(request.getNombreCiudad());

		ciudadList = entity.stream().map(
				ciudadEntity->new Ciudad(ciudadEntity.getIdCiudad(),ciudadEntity.getNombre(),ciudadEntity.getLatitud(),ciudadEntity.getLongitud())).collect(Collectors.toList());
		

		ciudades.setCiudad(ciudadList);
		
		response.setCiudades(ciudades);
		
		return response;

	}

}
