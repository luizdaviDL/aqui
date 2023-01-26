package com.loja.service.config.entradaDados;

import com.loja.service.models.Categoria;

public class ProdutosDados {
	private String nome;
	private double valor;
	private String validade;
	private String fabricante;
	private Categoria categoria;
	public ProdutosDados() {
		super();
	}
	
	public ProdutosDados(String nome, double valor, String validade, String fabricante, Categoria categoria) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.validade = validade;
		this.fabricante = fabricante;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
	
	
}
