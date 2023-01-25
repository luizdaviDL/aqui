package com.loja.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.service.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
