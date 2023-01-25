package com.loja.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.service.config.entradaDados.ProdutosDados;
import com.loja.service.servico.ProdutoServico;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoServico servico;
	/*save*/
	public void salvar(@RequestBody ProdutosDados dado) {
		servico.salvar(dado);
	}

}
