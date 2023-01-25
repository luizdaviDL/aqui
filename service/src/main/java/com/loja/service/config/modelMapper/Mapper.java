package com.loja.service.config.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mapper {
	@Bean
	 ModelMapper model() {
		return new ModelMapper();
	}

}
