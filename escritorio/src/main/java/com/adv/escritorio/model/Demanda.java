package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="demanda")
public class Demanda {


    @Column(name = "id_demanda")
    @Id
    private Integer idDemanda;

    private String area;

    @Column(name = "valor_envolvido")
    private Double valor;

    @Column(name = "viabilidade")
    private String viabilidade;

    private String fase;

    private String descricao;

    private String docs;


}
