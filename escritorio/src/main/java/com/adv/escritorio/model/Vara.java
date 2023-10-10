package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="vara")
public class Vara {


    @Column(name = "id_vara")
    @Id
    private Integer id;

    @Column(name = "nro_vara")
    private Integer numeroVara;

    @Column(name = "comarca_secao")
    private String comarcaSecao;

    private String tipo;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_tribunal")
    private Tribunal tribunal;



}
