package com.adv.escritorio.service;

import com.adv.escritorio.model.Demanda;

import java.util.List;
import java.util.Optional;

public interface DemandaService {

    Demanda save(Demanda demanda);

    List<Demanda> findAll();

    Optional<Demanda> findById(String id);

    Demanda update(Demanda demanda);

    void deleteById(String id);
}
