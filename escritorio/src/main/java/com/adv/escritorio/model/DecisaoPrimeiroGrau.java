package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="Decisao_Primeiro_Grau")
public class DecisaoPrimeiroGrau {

    @Column(name = "id_decisao")
    @Id
    private Integer id;

    private String tipo;

    private String teor;

    private Date data;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "id_tribunal")
    private Tribunal tribunal;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "id_vara")
    private Vara vara;

    @ManyToOne(fetch = LAZY)
    @EmbeddedId
    private Juiz juiz;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nro_unico")
    private Processo processo;

}
