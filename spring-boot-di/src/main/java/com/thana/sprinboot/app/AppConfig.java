package com.thana.sprinboot.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.thana.sprinboot.app.model.domain.ItemFactura;
import com.thana.sprinboot.app.model.domain.Producto;
import com.thana.sprinboot.app.model.service.Iservicio;
import com.thana.sprinboot.app.model.service.MiServicio;
import com.thana.sprinboot.app.model.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public Iservicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComlpejo")
	public Iservicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony alpha",300);
		Producto producto2 = new Producto("Camara Sony 123",212);
		Producto producto3 = new Producto("Camara Panasonic Julios",220);
		Producto producto4 = new Producto("Camara Sony beta",150);
		Producto producto5 = new Producto("Camara Sony cinnamon",20);
		Producto producto6 = new Producto("Camara Sony kiwi",10);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 6);
		ItemFactura linea4 = new ItemFactura(producto4, 5);
		ItemFactura linea5 = new ItemFactura(producto5, 3);
		ItemFactura linea6 = new ItemFactura(producto6, 1);


		return Arrays.asList(linea1,linea2,linea3,linea4,linea5,linea6);

	}
	
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Monitor Sony alpha",300);
		Producto producto2 = new Producto("Monitor Sony 123",212);
		Producto producto3 = new Producto("Teclado Panasonic Julios",220);
		Producto producto4 = new Producto("Monitor Sony beta",150);
		Producto producto5 = new Producto("Teclado Sony cinnamon",20);
		Producto producto6 = new Producto("Monitor Sony kiwi",10);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 6);
		ItemFactura linea4 = new ItemFactura(producto4, 5);
		ItemFactura linea5 = new ItemFactura(producto5, 3);
		ItemFactura linea6 = new ItemFactura(producto6, 1);


		return Arrays.asList(linea1,linea2,linea3,linea4,linea5,linea6);

	}
	
}
