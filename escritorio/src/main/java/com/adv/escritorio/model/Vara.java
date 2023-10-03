package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="vara")
public class Vara {


    @Column(name = "idVara")
    @Id
    private String id;

    @Column(name = "nro_vara")
    private Integer numeroVara;

    @Column(name = "comarca_secao")
    private String comarcaSecao;

    private String tipo;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idTribunal")
    private Tribunal tribunal;



}
