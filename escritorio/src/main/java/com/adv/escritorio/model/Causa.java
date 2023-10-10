package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="causa")
//@SecondaryTable(name = "demanda", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_demanda"))
//@SecondaryTable(name = "advogado", pkJoinColumns = @PrimaryKeyJoinColumn(name = "oab"))
//@SecondaryTable(name = "escritorio", pkJoinColumns = @PrimaryKeyJoinColumn(name = "oab"))
public class Causa {
    @Id
    @Column(name = "id_demanda")
    private Long idDemanda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advogado", referencedColumnName = "oab")
    private Advogado advogado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "escritorio", referencedColumnName = "oab")
    private Escritorio escritorio;
    //@Id
    //private String id;

//    @OneToOne(fetch = LAZY)
//    @JoinColumn(name = "id_demanda", table = "Demanda")
//    private Demanda demanda;
//
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "advogado", table = "Advogado")
//    private Advogado advogado;
//
//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "escritorio", table = "Escritorio")
//    private Escritorio escritorio;

}
