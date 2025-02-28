package com.JonasSMendes.produtosapi.service;

import com.JonasSMendes.produtosapi.entity.Pedido;
import com.JonasSMendes.produtosapi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido saveOrder (Pedido pedido){
        return repository.save(pedido);
    }

    public Pedido findOrderById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Pedido> findAllOrders(){
        return repository.findAll();
    }
}
