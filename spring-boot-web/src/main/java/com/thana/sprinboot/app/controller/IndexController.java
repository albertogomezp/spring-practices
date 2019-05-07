package com.thana.sprinboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //marca para spring. Se convierte en el controlador
@RequestMapping("/app")
public class IndexController {
	
	/**
	 * @return el nombre de la vista
	 */
	@GetMapping({"/index","/","/home",""}) //requestMapping vale, pero hay que especificar el method
	public String index(Model model) {
		model.addAttribute("titulo", "Spring");
		return "index";
	}
	
	
}
