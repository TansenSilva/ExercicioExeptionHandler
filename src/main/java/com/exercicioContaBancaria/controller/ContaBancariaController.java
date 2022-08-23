package com.exercicioContaBancaria.controller;

import com.exercicioContaBancaria.model.ContaBancariaModel;
import com.exercicioContaBancaria.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService service;

    @GetMapping(path = "/contabancaria")
    public ResponseEntity<List<ContaBancariaModel>> buscarTodasContas(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping(path = "/contabancaria/{codigo}")
    public ResponseEntity<Optional<ContaBancariaModel>> buscarContaPorId(@PathVariable Long codigo){
        return ResponseEntity.ok(service.bucarPorId(codigo));
    }

    @PostMapping(path = "/contabancaria")
    public ResponseEntity<ContaBancariaModel> cadastrarConta(@RequestBody ContaBancariaModel conta){
        return new ResponseEntity<>(service.cadastrar(conta),HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contabancaria/{codigo}")
    public void deletarConta(@PathVariable Long codigo){
        service.deletar(codigo);
    }
}
