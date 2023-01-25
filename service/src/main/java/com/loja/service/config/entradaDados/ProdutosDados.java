package com.loja.service.config.entradaDados;

import com.loja.service.models.Categoria;


public class ProdutosDados {
	private String nome;
	private Categoria categoria;
	public ProdutosDados() {
		super();
	}
	public ProdutosDados(String nome, Categoria categoria) {
		super();
		this.nome = nome;
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
	
	
}
