package com.adv.escritorio.service;

import com.adv.escritorio.model.Advogado;
import com.adv.escritorio.repository.AdvogadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvogadoServiceImpl implements AdvogadoService{
    @Autowired
    private AdvogadoRepository advogadoRepository;

    @Override
    public Advogado save(Advogado advogado) {
        return advogadoRepository.save(advogado);
    }

    @Override
    public List<Advogado> findAll() {
        return advogadoRepository.findAll();
    }

    @Override
    public Optional<Advogado> findById(String id) {
        return advogadoRepository.findById(id);
    }

    @Override
    public Advogado update(Advogado advogado) {
        return advogadoRepository.save(advogado);
    }

    @Override
    public void deleteById(String id) {
        advogadoRepository.deleteById(id);
    }
}
