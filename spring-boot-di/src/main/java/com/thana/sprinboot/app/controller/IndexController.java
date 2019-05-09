package com.thana.sprinboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thana.sprinboot.app.model.service.Iservicio;

@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("miServicioComplejo")
	private Iservicio servicio;

	


	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		model.addAttribute("titulo","holita");

		return "index";
	}

	
	
}
