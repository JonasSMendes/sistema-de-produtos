package com.JonasSMendes.produtosapi.controller;

import com.JonasSMendes.produtosapi.entity.Produto;
import com.JonasSMendes.produtosapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> saveProducts(@RequestBody  Produto produto){
       Produto novoProduto = service.saveProduto(produto);
       return ResponseEntity.ok(novoProduto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProductosById(@RequestBody @PathVariable Long id){
        var response = service.findById(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAllProducts(){
        List<Produto> response = service.findAllProducts();
        return ResponseEntity.ok().body(response);
    }
}
