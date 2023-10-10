package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity

@Table(name="vara")
public class Juiz {

    @Column(name = "nome")
    @Id
    private String nome;

    private String tipo;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name ="vara", referencedColumnName ="id_vara")
    private Vara vara;



}
