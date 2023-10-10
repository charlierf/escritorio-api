package com.adv.escritorio.service;

import com.adv.escritorio.model.Escritorio;

import java.util.List;
import java.util.Optional;

public interface EscritorioService {

    Escritorio save(Escritorio escritorio);

    List<Escritorio> findAll();

    Escritorio findById(String id);

    Escritorio update(Escritorio escritorio);

    void deleteById(String id);
}
