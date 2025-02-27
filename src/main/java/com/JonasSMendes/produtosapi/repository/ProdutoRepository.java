package com.JonasSMendes.produtosapi.repository;

import com.JonasSMendes.produtosapi.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
