package com.exercicioContaBancaria.model.operacoesContaBancaria;

import com.exercicioContaBancaria.model.ContaBancariaModel;

import java.math.BigDecimal;

public class Saque implements MovimentacoesBancarias {
    @Override
    public BigDecimal calculoMovimentacoes(ContaBancariaModel conta) {
        return conta.getValorAtualDaConta().subtract(conta.getValorFornecido());
    }
}
