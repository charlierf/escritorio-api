package com.adv.escritorio.service;

import com.adv.escritorio.model.Advogado;

import java.util.List;
import java.util.Optional;

public interface AdvogadoService {

    Advogado save(Advogado advogado);

    List<Advogado> findAll();

    Optional<Advogado> findById(String id);

    Advogado update(Advogado advogado);

    void deleteById(String id);
}
