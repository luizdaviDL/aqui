package com.loja.service.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.service.config.dto.ProdutoDto;
import com.loja.service.config.entradaDados.Conversor;
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
	@Autowired
	private Conversor conver;
	
	public void salvar(ProdutosDados dado) {
		Produto trans = entidade.paraEntidade(dado);
		repository.save(trans);
		
	}

	//getAll
	
	public List<ProdutoDto> pegarTodos() {
		List<Produto> produtos = repository.findAll();
		List<ProdutoDto> dto = conver.converter(produtos);
		return dto;
	}
	
	

	

}
