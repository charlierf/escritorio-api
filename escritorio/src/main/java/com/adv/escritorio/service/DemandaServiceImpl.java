package com.adv.escritorio.service;

import com.adv.escritorio.model.Advogado;
import com.adv.escritorio.model.Causa;
import com.adv.escritorio.model.Demanda;
import com.adv.escritorio.repository.AdvogadoRepository;
import com.adv.escritorio.repository.DemandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandaServiceImpl implements DemandaService{
    @Autowired
    private DemandaRepository demandaRepository;

    @Override
    public Demanda save(Demanda demanda) {
        return demandaRepository.save(demanda);
    }

    @Override
    public List<Demanda> findAll() {
        return demandaRepository.findAll();
    }

    @Override
    public Demanda findById(String id) {
        return demandaRepository.findById(id).orElse(null);
    }

    @Override
    public Demanda update(Demanda updatedDemanda) {
        String id = updatedDemanda.getIdDemanda().toString();
        Demanda existingDemanda = findById(id);

        if (existingDemanda != null) {

            if (updatedDemanda.getArea() != null) {
                existingDemanda.setArea(updatedDemanda.getArea());
            }

            if (updatedDemanda.getValor() != null) {
                existingDemanda.setValor(updatedDemanda.getValor());
            }

            if (updatedDemanda.getViabilidade() != null) {
                existingDemanda.setViabilidade(updatedDemanda.getViabilidade());
            }

            if (updatedDemanda.getFase() != null) {
                existingDemanda.setFase(updatedDemanda.getFase());
            }

            if (updatedDemanda.getDescricao() != null) {
                existingDemanda.setDescricao(updatedDemanda.getDescricao());
            }

            if (updatedDemanda.getDocs() != null) {
                existingDemanda.setDocs(updatedDemanda.getDocs());
            }

            return demandaRepository.save(existingDemanda);
        }

        return null;
    }

    @Override
    public void deleteById(String id) {
        demandaRepository.deleteById(id);
    }
}
