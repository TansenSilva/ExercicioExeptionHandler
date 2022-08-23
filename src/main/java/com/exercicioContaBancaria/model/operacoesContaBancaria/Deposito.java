package com.exercicioContaBancaria.model.operacoesContaBancaria;

import com.exercicioContaBancaria.model.ContaBancariaModel;

import java.math.BigDecimal;

public class Deposito implements MovimentacoesBancarias {
    @Override
    public BigDecimal calculoMovimentacoes(ContaBancariaModel conta) {
        return conta.getValorAtualDaConta().add(conta.getValorFornecido());
    }
}
