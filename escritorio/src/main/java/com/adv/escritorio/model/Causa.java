package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="causa")
@SecondaryTable(name = "demanda", pkJoinColumns = @PrimaryKeyJoinColumn(name = "idDemanda"))
public class Causa {

    @Id
    @OneToOne(fetch = LAZY)
    @JoinColumn(table="demanda", name = "idDemanda")
    private Demanda demanda;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "advogado")
    private Advogado advogado;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "escritorio")
    private Escritorio escritorio;

}
