package com.loja.service.config.dto;

import java.util.List;

import com.loja.service.models.Categoria;
import com.loja.service.models.Produto;


public class ProdutoDto {
	
	private Long id;
	private String nome;
	private double valor;
	private Categoria categoria;
	public ProdutoDto() {
		super();
	}
	public ProdutoDto(List<Produto> po) {
		
	}
	public ProdutoDto(Long id, String nome, double valor, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
	}

	public ProdutoDto(Produto var) {
		// TODO Auto-generated constructor stub
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
