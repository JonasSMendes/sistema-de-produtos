package com.JonasSMendes.produtosapi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ProductoNullException extends NullPointerException {

}
