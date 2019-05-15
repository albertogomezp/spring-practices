package com.spring.jpa.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.jpa.app.models.entity.Producto;
import com.spring.jpa.app.models.service.IProductoService;

@Controller
@SessionAttributes("Ival")
public class ClienteController {

	@Autowired // esto encontrará el repo
//	@Qualifier("IClienteDaoJPA") // Para mapear en caso de ambiguedad
	private IProductoService productoService;

	/**
	 * Lista todos los usuarios (por GET)
	 * 
	 * @param model
	 * @return Lista de clientes
	 */
	@RequestMapping(value = { "listar", "", "/" }, method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de productos");
		model.addAttribute("productos", productoService.findAll());
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
		Producto cliente = new Producto();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario de Cliente");
		model.put("accion", "crear cliente");
		model.put("whatis", "false");

		return "form";
	}

	/**
	 * Guada un producto
	 * 
	 * @param producto
	 * @return
	 */
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(@Valid @ModelAttribute("cliente") Producto producto, BindingResult result, Model model,
			SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de producto");
			model.addAttribute("accion", "Intentelo de nuevo");
			model.addAttribute("whatis", "true");

			return "form";
		} else {
			productoService.save(producto);
			status.setComplete();
			return "redirect:listar";
		}

	}
	/**
	 * Edita una entrada del listado
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/form/{codpro}")
	public String editar(@PathVariable(value = "codpro") Integer codpro, Map<String, Object> model) {
		Producto producto = null;
		if (codpro > 0) {
			producto = productoService.findOne(codpro);
		} else {
			return "redirect:/listar";
		}
		model.put("producto", producto);
		model.put("titulo", "Editar ".concat(producto.getNomPro()));
		model.put("accion", "Editar producto");
		model.put("whatis", "true");

		return "form";

	}
	@RequestMapping(value="/eliminar/{codpro}")
	public String eliminar(@PathVariable(value = "codpro") Integer codpro) {
		if(codpro>0) {
			productoService.delete(codpro);
		}
		return "redirect:/listar";
	}

}
