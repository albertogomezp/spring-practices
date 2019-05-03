package com.example.demo.holamundo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${application.controller.mensaje}")
	private String mensaje;
	
	@GetMapping("/")
	public String hola(Model model) {
		model.addAttribute("mensaje",mensaje);
		return "hola";
	}
	
	
}
