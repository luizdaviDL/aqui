package com.loja.service.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(mappedBy = "categoria")
	private List<Produto> produtos = new ArrayList<>();
	private LocalDate cadastro = LocalDate.now();
	public Categoria() {
		super();
	}
	public Categoria(Long id, String nome, List<Produto> produtos, LocalDate cadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
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
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public LocalDate getCadastro() {
		return cadastro;
	}
	public void setCadastro(LocalDate cadastro) {
		this.cadastro = cadastro;
	}
	
	
}
