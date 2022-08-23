package com.exercicioContaBancaria.exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerContaBancaria {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> exceptionHandlerEntradaInvalida(HttpMessageNotReadableException exception, HttpServletRequest request){
        return new ResponseEntity<>("Campo inválido", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> exceptionHandlerChaveDuplicada(ConstraintViolationException exception, HttpServletRequest request){
        return new ResponseEntity<>("Conta duplicada", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MonvimentacaoInvalidaException.class)
    public ResponseEntity<String> exceptionHandlerMovimentacaoInvalida(MonvimentacaoInvalidaException exception){
        return new ResponseEntity<>("Tipo de movimentação inválida",HttpStatus.BAD_REQUEST);
    }



}
