package com.exercicioContaBancaria.service;

import com.exercicioContaBancaria.model.ContaBancariaModel;
import com.exercicioContaBancaria.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository repository;
    public List<ContaBancariaModel> buscarTodos(){
        return repository.findAll();
    }
    public Optional<ContaBancariaModel> bucarPorId(Long codigo){
        return repository.findById(codigo);
    }
    public ContaBancariaModel cadastrar(ContaBancariaModel conta){


        conta.getId();
        conta.getNumeroDeConta();
        conta.getAgencia();
        conta.getNomeDoUsuario();
        conta.getValorAtualDaConta();
//        conta.setTipoDeServiço();
//        conta.setValorFinal();

        return repository.save(conta);
    }

    public void deletar(Long codigo){
        repository.deleteById(codigo);
    }

}
