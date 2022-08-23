package com.exercicioContaBancaria.controller;


import com.exercicioContaBancaria.model.ContaBancariaModel;
import com.exercicioContaBancaria.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService service;

    @GetMapping(path = "/contabancaria")
    public List<ContaBancariaModel> buscarTodasContas(){
        return service.buscarTodos();
    }

    @GetMapping(path = "/contabancaria/{codigo}")
    public Optional<ContaBancariaModel> buscarContaPorId(@PathVariable Long codigo){
        return service.bucarPorId(codigo);
    }

    @PostMapping(path = "/contabancaria")
    @ResponseStatus(HttpStatus.CREATED)
    public ContaBancariaModel cadastrarConta(@RequestBody ContaBancariaModel conta){
        return service.cadastrar(conta);
    }

    @DeleteMapping(path = "/contabancaria/{codigo}")
    public void deletarConta(@PathVariable Long codigo){
        service.deletar(codigo);
    }
}
