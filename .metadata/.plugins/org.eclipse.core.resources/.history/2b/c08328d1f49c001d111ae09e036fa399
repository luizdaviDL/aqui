package com.loja.service.config.entradaDados;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loja.service.models.Produto;

@Component
public class DadoEntidade {
	@Autowired
	private ModelMapper mapper;
	
	public Produto paraEntidade(ProdutosDados dado) {
		
		return mapper.map(dado, Produto.class);
	}

	
}
