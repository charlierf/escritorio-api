package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="camara")
public class Camara {


    @Column(name = "idCamara")
    @Id
    private String id;

    @Column(name = "nro_camara")
    private Integer numeroCamara;

    @Column(name = "competencia")
    private String competencia;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idTribunal")
    private Tribunal tribunal;



}
