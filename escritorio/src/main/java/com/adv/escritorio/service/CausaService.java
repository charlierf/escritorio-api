package com.adv.escritorio.service;

import com.adv.escritorio.model.Causa;

import java.util.List;
import java.util.Optional;

public interface CausaService {

    Causa save(Causa causa);

    List<Causa> findAll();

    Optional<Causa> findById(String id);

    Causa update(Causa causa);

    void deleteById(String id);
}
