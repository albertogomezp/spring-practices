package com.example.demo.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
		
	@Value("${application.controller.titulo}")
	private String titulo;
	
	
		/**
		 * Devuelve hola mundo
		 * RequestMapping para GET y POST
		 * @param model
		 * @return
		 */
		@GetMapping("/index") 
		public String index(Model model) {
			model.addAttribute("titulo",titulo);
			return "index";
		}
}
