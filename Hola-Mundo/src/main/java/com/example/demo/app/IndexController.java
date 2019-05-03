package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

		/**
		 * Devuelve hola mundo
		 * @param model
		 * @return
		 */
		@GetMapping("/index") //RequestMapping para GET y POST
		public String index(Model model) {
			model.addAttribute("titulo","Hola mundo");
			return "vista";
		}
}
