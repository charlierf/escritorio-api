package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="funcionario")
public class Funcionario {


    @Column(name = "matricula")
    @Id
    private Integer id;

    private String setor;

    private Double salario;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "cpf_cnpj")
    private Pessoa pessoa;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "oab")
    private Escritorio escritorio;

}
