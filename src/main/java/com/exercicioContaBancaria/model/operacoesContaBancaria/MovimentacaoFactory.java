package com.exercicioContaBancaria.model.operacoesContaBancaria;

public class MovimentacaoFactory {

    public  MovimentacoesBancarias calculoTipoMovimentacao (String tipoDeServiço){
        if (tipoDeServiço.equalsIgnoreCase("DEPÓSITO")){
            return new Deposito();
        } else if (tipoDeServiço.equalsIgnoreCase("SAQUE")) {
            return new Saque();
        }
        return null;
    }
}
