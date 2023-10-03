package com.adv.escritorio.model;

import com.adv.escritorio.model.enums.EstadoEnum;
import com.adv.escritorio.model.enums.HonorariosEnum;
import com.adv.escritorio.model.enums.converter.EstadoConverter;
import com.adv.escritorio.model.enums.converter.HonorariosConverter;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.FetchType.LAZY;


@Data
@Entity
@Table(name="advogado")
public class Honorarios {


    @Column(name = "idHonorarios", nullable = false)
    @Id
    private String id;

    @Column(name = "valor_original")
    private Double valorOriginal;

    @Column(name = "valor_pago")
    private Double valorPago;

    @Column(name = "vencimento")
    private Date vencimento;

    @Column(name = "data_pgmt")
    private Date dataPagamento;

    @Convert(converter = HonorariosConverter.class)
    @Column(name = "tipo", nullable = false)
    private HonorariosEnum tipo;

    @Convert(converter = EstadoConverter.class)
    @Column(name = "estado", nullable = false)
    private EstadoEnum estado;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "idDemanda")
    private Demanda demanda;

}
