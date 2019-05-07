package com.thana.sprinboot.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	
	@GetMapping("/string")
	public String param(@RequestParam(name="text", required=false, defaultValue="n/a") String text, Model model) {
		model.addAttribute("resultado","el texto enviado es: "+text);
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(String saludo, Integer numero, Model model) {
		model.addAttribute("resultado","el saludo enviado es: '"+saludo+"' y el numero es: "+numero);
		return "params/ver";
	}
	
	@GetMapping("/mix-servlet")
	public String param(HttpServletRequest request, HttpServletResponse response,Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero;
		try {
			 numero = Integer.parseInt(request.getParameter("numero"));
		}
		catch(NumberFormatException e) {
			numero = 0;
		}
		model.addAttribute("resultado","el saludo enviado es: '"+saludo+"' y el numero es: "+numero);

		return "params/ver";
	}
}
