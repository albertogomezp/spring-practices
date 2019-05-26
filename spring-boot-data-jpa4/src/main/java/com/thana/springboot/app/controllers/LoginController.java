package com.thana.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.thana.springboot.app.models.service.IClienteService;
import com.thana.springboot.app.models.service.IUploadFileService;

@Controller
@SessionAttributes("login")
public class LoginController {

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IUploadFileService uploadFileService;

	
}
