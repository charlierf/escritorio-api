package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="Decisao_Segundo_Grau")
public class DecisaoSegundoGrau {

    @Column(name = "id_decisao")
    @Id
    private Integer id;

    private String tipo;

    private String teor;

    private Date data;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_desembargador")
    private Desembargador desembargador;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_camara")
    private Camara camara;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nro_unico")
    private Recurso recurso;

}
