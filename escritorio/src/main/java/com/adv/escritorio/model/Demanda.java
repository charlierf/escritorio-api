package com.adv.escritorio.model;

import com.adv.escritorio.model.enums.ViabilidadeEnum;
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
    private Long idDemanda;

    private String area;

    @Column(name = "valor_envolvido")
    private Double valor;

    @Column(name = "viabilidade")
    private ViabilidadeEnum viabilidade;

    private String fase;

    private String descricao;

    private String docs;


}
