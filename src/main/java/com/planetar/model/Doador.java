package com.planetar.model;


import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doador")
public class Doador implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String sobrenome;
	
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private Long rg;
	@Column(nullable = false)
	private Long cpf;
	
	@Modifying
	@Query("ALTER TABLE doador DROP COLUMN telefone")
	void removeTelefoneColumn() {
	}

	
	private String disponibilidade;
	@Column(nullable = false)
	private Long numero_casa;
	
	@Column(nullable = false)
	private String estado;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false, length = 20)
	private String telefone;

	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String rua;
	
	@Column(nullable = false)
	private Long cep;

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Number getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public Number getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String number) {
		this.telefone = number;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public void setNumero_casa(Long numero_casa) {
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long number) {
		this.cep = number;
	}

	public Doador(Long id, String nome, String sobrenome, String email, Long rg, Long cpf, String telefone,
			String disponibilidade, Long numero_casa, String estado, String cidade, String bairro, String rua,
			Long cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.disponibilidade = disponibilidade;
		this.numero_casa = numero_casa;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
	}
	public Doador() {
		super();
		
	}
}
