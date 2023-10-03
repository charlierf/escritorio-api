package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="demanda")
public class Demanda {


    @Column(name = "idDemanda")
    @Id
    private String id;

    private String area;

    @Column(name = "valor_envolvido")
    private Double valor;

    @Column(name = "viabilidade")
    private Double viabilidade;

    private String fase;

    private String descricao;

    private String docs;


}
