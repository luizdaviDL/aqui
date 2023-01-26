package com.loja.service.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double valor;
	private String validade;
	private String fabricante;
	@OneToOne
	private Categoria categoria;
	private LocalDate cadastro = LocalDate.now();
	public Produto() {
		super();
	}
	
	public Produto(Long id, String nome, double valor, String validade, String fabricante, Categoria categoria,
			LocalDate cadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.validade = validade;
		this.fabricante = fabricante;
		this.categoria = categoria;
		this.cadastro = cadastro;
	}

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
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public LocalDate getCadastro() {
		return cadastro;
	}

	public void setCadastro(LocalDate cadastro) {
		this.cadastro = cadastro;
	}
	
	
}
