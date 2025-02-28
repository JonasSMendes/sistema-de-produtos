package com.JonasSMendes.produtosapi.controller;

import com.JonasSMendes.produtosapi.entity.Pedido;
import com.JonasSMendes.produtosapi.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<Pedido> save (@RequestBody Pedido pedido){
        Pedido newPedido =  service.saveOrder(pedido);
        return ResponseEntity.ok(newPedido);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll (){
        List<Pedido> listaDePedidos = service.findAllOrders();
        return ResponseEntity.ok(listaDePedidos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> findById (@RequestBody @PathVariable Long id){
        Pedido pedido = service.findOrderById(id);
        return ResponseEntity.ok(pedido);
    }
}
