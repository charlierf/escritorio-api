package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Table(name="adversario")
@Embeddable
public class Adversario {

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "cpf_cnpj")
    private Pessoa pessoa;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idDemanda")
    private Demanda demanda;
}
