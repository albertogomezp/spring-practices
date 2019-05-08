package com.ival.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller //marca para spring. Se convierte en el controlador
@RequestMapping("/app")
public class IndexController {
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.index.perfil}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.index.listar}")
	private String textoListar;
	
	@GetMapping({"/index","/","/home",""}) //requestMapping vale, pero hay que especificar el method
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		//model.addAttribute("usuarios", pasarUsuarios());

		return "index";
	}
	@RequestMapping({"/login","iniciosesion","loginform"})
	public String login(Model model) {
	//	return "forward:/app/login";
		return "login";
	}
	
	@RequestMapping({"/signin","registro"})
	public String signin(Model model) {
	//	return "forward:/app/login";
		return "signin";
	}
	
	@RequestMapping({"/perfil","/me"})
	public String perfil(Model model) {
		/*Usuario usuario = new Usuario();
		usuario.setApellido("Gómez");
		usuario.setNombre("Alberto");
		usuario.setEmail("albertogomp");*/
		
		//model.addAttribute("usuario", usuario);
		//model.addAttribute("titulo",textoPerfil.concat(" ").concat(usuario.getNombre()));
		return "perfil";
	}
	

	@RequestMapping({"/listar","/users"})
	public String listar(Model model) {



		
		//model.addAttribute("usuarios", pasarUsuarios());
		model.addAttribute("titulo",textoListar);
		return "listar";
	}
	
//	@ModelAttribute("usuarios")
//	public List<Usuario> pasarUsuarios(){
//		List<Usuario> usuarios = new ArrayList<>();
//		usuarios.add(new Usuario("Alberto","Gómez","albertogomp@gmail.com"));
//		usuarios.add(new Usuario("Juan","Guaido","albertogomp@gmail.com"));
//		usuarios.add(new Usuario("Manolo","Lobato","albertogomp@gmail.com"));
//		usuarios.add(new Usuario("Pedro","Ximenez","albertogomp@gmail.com"));
//		usuarios.add(new Usuario("Pablo","Pinto","albertogomp@gmail.com"));
//		return usuarios;
//	}
//	
}
