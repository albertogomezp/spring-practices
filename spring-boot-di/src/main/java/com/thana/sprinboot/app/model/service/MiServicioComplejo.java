package com.thana.sprinboot.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
@Secondary
public class MiServicioComplejo implements Iservicio {

	@Override
	public String operacion() {
		return "Hackeando el hexágono... Iniciando HTML....";
	}

	public MiServicioComplejo() {
		super();
	}
	
	
	
}
