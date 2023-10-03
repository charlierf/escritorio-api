package com.adv.escritorio.service;

import com.adv.escritorio.model.Processo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProcessoService {

    Processo save(Processo Processo);

    List<Processo> findAll();

    Optional<Processo> findById(String id);

    Processo update(Processo Processo);

    void deleteById(String id);
}
