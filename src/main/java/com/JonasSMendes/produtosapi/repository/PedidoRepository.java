package com.JonasSMendes.produtosapi.repository;

import com.JonasSMendes.produtosapi.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
