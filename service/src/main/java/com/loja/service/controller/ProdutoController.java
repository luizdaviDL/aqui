package com.loja.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.service.config.dto.ProdutoDto;
import com.loja.service.config.entradaDados.ProdutosDados;
import com.loja.service.servico.ProdutoServico;

@RestController
@RequestMapping(value="/produto")
public class ProdutoController {
	@Autowired
	private ProdutoServico servico;
	/*save*/
	@PostMapping
	public void salvar(@RequestBody ProdutosDados dado) {
		servico.salvar(dado);
	}
	
	/*getAll*/
	
	@GetMapping(value="/todos")
	public List<ProdutoDto> todos() {
		return servico.pegarTodos();
	} 
	

}
