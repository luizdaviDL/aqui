package com.loja.service.config.entradaDados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.loja.service.config.dto.ProdutoDto;
import com.loja.service.models.Produto;
@Component
public class Conversor {

	public List<ProdutoDto> converter(List<Produto> produtos) {

		List<ProdutoDto> dtos = new ArrayList<>();
		
		produtos.stream().forEach(var ->{
			
			ProdutoDto dto = new ProdutoDto(var);
			dtos.add(dto);
		});
		return dtos;
	}

	
}
