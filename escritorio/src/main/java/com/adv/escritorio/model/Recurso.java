package com.adv.escritorio.model;

import com.adv.escritorio.model.enums.ProcessoEnum;
import com.adv.escritorio.model.enums.converter.ProcessoConverter;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="recurso")
public class Recurso {


    @Column(name = "nro_recurso")
    @Id
    private String id;

    @Column(name = "nro_unico")
    private Integer numero;

    @Column(name = "comarca_secao")
    private String comarcaSecao;

    private String tipo;

    @Column(name = "data_julgamento")
    private Date dataJulgamento;

    @Column(name = "data_recurso")
    private Date dataRecurso;

    @Column(name = "recorrente")
    private SmallIntJdbcType recorrente;

    @Convert(converter = ProcessoConverter.class)
    @Column(name = "Resultado", nullable = false)
    private ProcessoEnum resultado;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idTribunal")
    private Tribunal tribunal;



}
