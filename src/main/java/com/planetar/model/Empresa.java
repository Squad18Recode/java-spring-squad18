package com.planetar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false)
	private String nome;
	
	
	@Column(nullable = false)
	private String caracteristica_empresa;
	
	@Column(nullable = false)
	private Number cnpj;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristica_empresa() {
		return caracteristica_empresa;
	}

	public void setCaracteristica_empresa(String caracteristica_empresa) {
		this.caracteristica_empresa = caracteristica_empresa;
	}

	public Number getCnpj() {
		return cnpj;
	}

	public void setCnpj(Number cnpj) {
		this.cnpj = cnpj;
	}

	public Empresa(Long id, String nome, String caracteristica_empresa, Number cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.caracteristica_empresa = caracteristica_empresa;
		this.cnpj = cnpj;
	}

	public Empresa() {
		super();
		
	}
	
	
	
}

