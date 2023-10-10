package com.adv.escritorio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="tribunal")
public class Tribunal {


    @Column(name = "id_tribunal")
    @Id
    private Integer id;

    private String nome;

    private String abrangencia;

    private String tipo;


}
