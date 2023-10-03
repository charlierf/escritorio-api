package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="Decisão_Primeiro_Grau")
public class DecisaoPrimeiroGrau {

    @Column(name = "idDecisão")
    @Id
    private String id;

    private String tipo;

    private String teor;

    private Date data;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "idTribunal")
    private Tribunal tribunal;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "idVara")
    private Vara vara;

    @ManyToOne(fetch = LAZY)
    @EmbeddedId
    private Juiz juiz;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "nro_unico")
    private Processo processo;

}
