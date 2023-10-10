package com.adv.escritorio.service;

import com.adv.escritorio.model.Demanda;
import com.adv.escritorio.model.Escritorio;
import com.adv.escritorio.repository.EscritorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscritorioServiceImpl implements EscritorioService{
    @Autowired
    private EscritorioRepository escritorioRepository;

    @Override
    public Escritorio save(Escritorio escritorio) {
        return escritorioRepository.save(escritorio);
    }

    @Override
    public List<Escritorio> findAll() {
        return escritorioRepository.findAll();
    }

    @Override
    public Escritorio findById(String id) {
        return escritorioRepository.findById(id).orElse(null);
    }

    @Override
    public Escritorio update(Escritorio updatedEscritorio) {
        String id = updatedEscritorio.getId();
        Escritorio existingEscritorio = findById(id);

        if (existingEscritorio != null) {

            if (updatedEscritorio.getAreasAtuacao() != null) {
                existingEscritorio.setAreasAtuacao(updatedEscritorio.getAreasAtuacao());
            }

            if (updatedEscritorio.getDespesas() != null) {
                existingEscritorio.setDespesas(updatedEscritorio.getDespesas());
            }

            return escritorioRepository.save(existingEscritorio);
        }

        return null;
    }

    @Override
    public void deleteById(String id) {
        escritorioRepository.deleteById(id);
    }
}
