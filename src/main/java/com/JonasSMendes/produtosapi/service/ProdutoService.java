package com.JonasSMendes.produtosapi.service;

import com.JonasSMendes.produtosapi.entity.Produto;
import com.JonasSMendes.produtosapi.exception.ProductPriceException;
import com.JonasSMendes.produtosapi.exception.ProductoNullException;
import com.JonasSMendes.produtosapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto saveProduto(Produto produto){
        if (produto.getName() == null || produto.getPrice() == null)
            throw new ProductoNullException();
        if (produto.getPrice() < 0)
            throw new ProductPriceException();

       return repository.save(produto);
    }

    public Produto findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Produto> findAllProducts(){
        return repository.findAll();
    }


}
