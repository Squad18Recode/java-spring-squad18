package com.planetar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "catador")
public class Catador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private Number rg;
	@Column(nullable = false)
	private Number cpf;
	@Column(nullable = false)
	private Number telefone;
	@Column(nullable = false)
	private String disponibilidade;
	@Column(nullable = false)
	private Number numero_casa;
	@Column(nullable = false)
	private String estado;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private Number cep;

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

	public Number getRg() {
		return rg;
	}

	public void setRg(Number rg) {
		this.rg = rg;
	}

	public Number getCpf() {
		return cpf;
	}

	public void setCpf(Number cpf) {
		this.cpf = cpf;
	}

	public Number getTelefone() {
		return telefone;
	}

	public void setTelefone(Number telefone) {
		this.telefone = telefone;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Number getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(Number numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Number getCep() {
		return cep;
	}

	public void setCep(Number cep) {
		this.cep = cep;
	}

	public Catador(Long id, String nome, Number rg, Number cpf, Number telefone, String disponibilidade,
			Number numero_casa, String estado, String cidade, String bairro, Number cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.disponibilidade = disponibilidade;
		this.numero_casa = numero_casa;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	public Catador() {
		super();
		
	}
	
	
}

