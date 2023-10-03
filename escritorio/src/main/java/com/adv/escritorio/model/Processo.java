package com.adv.escritorio.model;

import com.adv.escritorio.model.enums.ProcessoEnum;
import com.adv.escritorio.model.enums.converter.ProcessoConverter;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="processo")
public class Processo {


    @Column(name = "nro_unico")
    @Id
    private String id;

    @Column(name = "nro_interno")
    private String numero;

    private String fase;

    @Column(name = "data_inicial")
    private Date dataInicial;

    @Column(name = "valor_da_causa")
    private Double valorDaCausa;

    @Column(name = "transito_julgado", nullable = false)
    private SmallIntJdbcType transitoJulgado;

    private String estado;

    @Convert(converter = ProcessoConverter.class)
    @Column(name = "Resultado", nullable = false)
    private ProcessoEnum resultado;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "idDemanda")
    private Demanda demanda;

}
