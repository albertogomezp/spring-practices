package com.thana.sprinboot.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements Iservicio {

	@Override
	@Primary
	public String operacion() {
		return "Hackeando el petagono... Iniciando HTML....";
	}

	public MiServicio() {
		super();
	}
	
	
	
}
