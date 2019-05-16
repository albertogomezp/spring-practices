package com.spring.jpa.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.jpa.app.models.entity.Cliente;
import com.spring.jpa.app.models.service.IClienteService;

@Controller
@SessionAttributes("cliente")
public class ClienteController {

	@Autowired // esto encontrará el repo
//	@Qualifier("IClienteDaoJPA") // Para mapear en caso de ambiguedad
	private IClienteService clienteService;

	/**
	 * Lista todos los usuarios (por GET)
	 * 
	 * @param model
	 * @return Lista de clientes
	 */
	@RequestMapping(value = { "listar", "", "/" }, method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("clientes", clienteService.findAll());
		return "listar";
	}

	/**
	 * Crea formulario de registro
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario de Cliente");
		model.put("accion", "crear cliente");
		model.put("whatis", "false");

		return "form";
	}

	/**
	 * Guada un usuario
	 * 
	 * @param cliente
	 * @return
	 */
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Cliente");
			model.addAttribute("accion", "Intentelo de nuevo");
			model.addAttribute("whatis", "true");

			return "form";
		} else {
			clienteService.save(cliente);
			status.setComplete();
			flash.addFlashAttribute("msg","true");
			flash.addFlashAttribute("success", "Cliente guardado con éxito");
			return "redirect:listar";
		}

	}
	/**
	 * Edita una entrada del listado
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash ) {
		Cliente cliente = null;
		if (id > 0) {
			cliente = clienteService.findOne(id);
			if (cliente == null) {
				flash.addFlashAttribute("error", "El ID del cliente no existe en la base de datos");

			}
		} else {
			flash.addAttribute("error", "El ID del cliente no puede ser 0");

			return "redirect:/listar";
		}
		model.put("cliente", cliente);
		model.put("titulo", "Editar ".concat(cliente.getNombre().concat(" ").concat(cliente.getApellido())));
		model.put("accion", "Editar cliente");
		model.put("whatis", "true");
	
		return "form";

	}
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {
		if(id>0) {
			clienteService.delete(id);
			flash.addFlashAttribute("msg","true");
			flash.addFlashAttribute("success", "Cliente eliminado con éxito");

		}
		return "redirect:/listar";
	}

}
