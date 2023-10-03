package com.adv.escritorio.service;

import com.adv.escritorio.model.Advogado;
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
    public Optional<Demanda> findById(String id) {
        return demandaRepository.findById(id);
    }

    @Override
    public Demanda update(Demanda demanda) {
        return demandaRepository.save(demanda);
    }

    @Override
    public void deleteById(String id) {
        demandaRepository.deleteById(id);
    }
}
