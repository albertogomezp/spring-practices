package com.ival.app.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ival.app.controller.SubCore;
import com.ival.app.dao.IvalDAO;
import com.ival.app.model.SecureLogin;
import com.ival.app.security.Passwords;;
@Controller 
@RequestMapping("/core") 
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IvalDAO ivalDAO = new IvalDAO();

	@GetMapping({"/login"}) //requestMapping vale, pero hay que especificar el method
	public String login(Model model,HttpServletRequest request, HttpServletResponse response) throws NoSuchAlgorithmException, InvalidKeySpecException, SQLException, ServletException, IOException {
		//SubCore.login(request,response);
		//--> Create login object 
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		SecureLogin log = new SecureLogin(username,pass);
		
		//--> Check if login can be done
		boolean canLog = false;
		ivalDAO.openCurrentSession();
			SecureLogin almacenado = ivalDAO.login(username);
			
			System.out.println(almacenado.toString());
			if(almacenado.getUser() !="default") {
				System.out.println("Almacenado no es null");
				//-- > gets salt
				String salt = almacenado.getCondimento();
				//--> Generates strong password
				String checkpass = Passwords.generateStorngPasswordHash(pass, salt);
				System.out.println("Stored: '"+almacenado.getPassword()+"'");
				System.out.println("Latest: '"+checkpass+"'");
				if(checkpass.equals(almacenado.getPassword())) {
					canLog = true;
					System.out.println("cambia a true");
				}
				else {
					canLog = false;
					System.out.println("cambia a false");
				}
			}
			else {
				canLog = false;
			}
		System.out.println(canLog);
		ivalDAO.closeCurrentSession();
		
		if(canLog) {
			System.out.println("go index");

			RequestDispatcher dispatcher = request.getRequestDispatcher("/index"); // ??? 
			request.setAttribute("msg", "Successfully loged in");
			request.setAttribute("username", username);
			dispatcher.forward(request, response);
		}
		else {
			System.out.println("go back");
			RequestDispatcher dispatcher =  request.getRequestDispatcher("/app/login");;
			request.setAttribute("msg", "Error in login");
			dispatcher.forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		return "forward:/app/";
	}
	@GetMapping({"/signin"}) //requestMapping vale, pero hay que especificar el method
	public String signin(Model model,HttpServletRequest request, HttpServletResponse response) throws NoSuchAlgorithmException, InvalidKeySpecException, SQLException, ServletException, IOException {
		SubCore.signin(request,response);

		return "forward:/app/";
	}
}

