package com.spring.jpa.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_PRO")
	private Integer CodPro;
	@NotEmpty
	@Size(min = 3, max = 300)
	@Column(name = "NOM_PRO")
	private String NomPro;
	@NotEmpty
	@Size(min = 3)
	@Column(name = "DESC_PRO")
	private String DescPro;
	@NotEmpty
	@Column(name = "PRE_PRO")
	private float PrePro;
	@Column(name = "STOCK_PRO")
	private Integer StockPro;

	private static final long serialVersionUID = 1L;

	public Integer getCodPro() {
		return CodPro;
	}

	public void setCodPro(Integer codPro) {
		CodPro = codPro;
	}

	public String getNomPro() {
		return NomPro;
	}

	public void setNomPro(String nomPro) {
		NomPro = nomPro;
	}

	public String getDescPro() {
		return DescPro;
	}

	public void setDescPro(String descPro) {
		DescPro = descPro;
	}

	public float getPrePro() {
		return PrePro;
	}

	public void setPrePro(float prePro) {
		PrePro = prePro;
	}

	public Integer getStockPro() {
		return StockPro;
	}

	public void setStockPro(Integer stockPro) {
		StockPro = stockPro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
