package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="advogado")
public class Cliente {


    @Column(name = "idCliente")
    @Id
    private String id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "cpf_cnpj")
    private Pessoa pessoa;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "oab")
    private Escritorio escritorio;
}
