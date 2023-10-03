package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="advogado")
public class Advogado {


    @Column(name = "oab")
    @Id
    private String id;

    private String especialidades;

    private Double remuneracao;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "cpf_cnpj")
    private Pessoa pessoa;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "escritorio")
    private Escritorio escritorio;
}
