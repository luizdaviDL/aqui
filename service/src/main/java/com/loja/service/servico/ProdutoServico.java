package com.loja.service.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.service.config.entradaDados.DadoEntidade;
import com.loja.service.config.entradaDados.ProdutosDados;
import com.loja.service.models.Produto;
import com.loja.service.repository.ProdutoRepository;

@Service
public class ProdutoServico {
	@Autowired
	private ProdutoRepository repository;
	@Autowired
	private DadoEntidade entidade;
	
	public void salvar(ProdutosDados dado) {
		Produto trans = entidade.paraEntidade(dado);
		//repository.sa
		
	}

}
