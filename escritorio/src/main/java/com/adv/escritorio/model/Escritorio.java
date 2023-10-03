package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="escritorio")
public class Escritorio {


    @Column(name = "oab")
    @Id
    private String id;

    @Column(name = "areas_atuacao")
    private String areasAtuacao;

    private Double despesas;

}
