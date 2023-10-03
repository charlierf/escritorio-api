package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="Decisão_Segundo_Grau")
public class DecisaoSegundoGrau {

    @Column(name = "idDecisão")
    @Id
    private String id;

    private String tipo;

    private String teor;

    private Date data;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idDesembargador")
    private Desembargador desembargador;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idCamara")
    private Camara camara;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nro_unico")
    private Recurso recurso;

}
