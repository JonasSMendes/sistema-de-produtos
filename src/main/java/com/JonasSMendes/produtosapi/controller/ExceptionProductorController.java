package com.JonasSMendes.produtosapi.controller;

import com.JonasSMendes.produtosapi.exception.ProductPriceException;
import com.JonasSMendes.produtosapi.exception.ProductoNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionProductorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductoNullException.class)
    public ResponseEntity<Object> productNullException(){

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Verifique os campos do produto");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<Object> priceNullException(){

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Verifique o campos de preço");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
