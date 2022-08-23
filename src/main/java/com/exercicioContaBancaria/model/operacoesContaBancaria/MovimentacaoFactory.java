package com.exercicioContaBancaria.model.operacoesContaBancaria;

import com.exercicioContaBancaria.exception.MonvimentacaoInvalidaException;

public class MovimentacaoFactory {

    public  MovimentacoesBancarias calculoTipoMovimentacao (String tipoDeServiço){
        if(! tipoDeServiço.equalsIgnoreCase("deposito") && ! tipoDeServiço.equalsIgnoreCase("saque")){
         throw new MonvimentacaoInvalidaException("Movimentação inválida!");
        }
        if (tipoDeServiço.equalsIgnoreCase("DEPOSITO")||tipoDeServiço.equalsIgnoreCase("DEPÓSITO")){
            return new Deposito();
        } else if (tipoDeServiço.equalsIgnoreCase("SAQUE")) {
            return new Saque();
        }
        return null;
    }
}
