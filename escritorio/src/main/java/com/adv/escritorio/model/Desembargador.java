package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="desembargador")
public class Desembargador {
    @Column(name = "id_desembargador")
    @Id
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_camara")
    private Camara camara;



}
