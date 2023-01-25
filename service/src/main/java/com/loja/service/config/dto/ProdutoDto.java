package com.loja.service.config.dto;

import com.loja.service.models.Categoria;


public class ProdutoDto {
	
	private Long id;
	private String nome;
	private Categoria categoria;
	public ProdutoDto() {
		super();
	}
	public ProdutoDto(Long id, String nome, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
