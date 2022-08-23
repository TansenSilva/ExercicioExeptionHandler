package com.exercicioContaBancaria.model.operacoesContaBancaria;

import com.exercicioContaBancaria.model.ContaBancariaModel;

import java.math.BigDecimal;

public interface MovimentacoesBancarias {

    public BigDecimal calculoMovimentacoes(ContaBancariaModel conta);
}
