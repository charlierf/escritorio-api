package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="camara")
public class Camara {


    @Column(name = "id_camara")
    @Id
    private Integer id;

    @Column(name = "nro_camara")
    private Integer numeroCamara;

    @Column(name = "competencia")
    private String competencia;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_tribunal")
    private Tribunal tribunal;



}
