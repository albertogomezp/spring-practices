package com.thana.sprinboot.app.model;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String apellido, String email) {
		super();
		this.email = email;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
