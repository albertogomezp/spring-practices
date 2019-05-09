package com.thana.sprinboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/index","/","/inicio",""}) //requestMapping vale, pero hay que especificar el method
	public String home(Model model) {


		return "forward:/app/";
	}

}
