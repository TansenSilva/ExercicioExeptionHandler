package com.exercicioContaBancaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conta_bancaria")

public class ContaBancariaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30,nullable = false,unique = true)
    private String numeroDeConta;

    @Column(length = 30,nullable = false)
    private String agencia;

    @Column(length = 50,nullable = false)
    private String nomeDoUsuario;

    @Column(length = 50,nullable = false)
    private BigDecimal valorAtualDaConta;

    @Column(length = 50,nullable = false)
    private BigDecimal valorFornecido;

    @Column(length = 50,nullable = false)
    private BigDecimal valorFinal;

    @Column(length = 20,nullable = false)
    private String tipoDeServico;
}
