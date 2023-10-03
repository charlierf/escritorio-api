package com.adv.escritorio.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="pessoa")
public class Pessoa {


    @Column(name = "cpf_cnpj")
    @Id
    private String id;

    private String endereco;

    private String telefone;

    private String email;

    private String nome;

    private String sobrenome;

}
