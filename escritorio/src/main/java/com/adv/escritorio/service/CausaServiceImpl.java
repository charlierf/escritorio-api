package com.adv.escritorio.service;

import com.adv.escritorio.model.Causa;
import com.adv.escritorio.repository.CausaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CausaServiceImpl implements CausaService{
    @Autowired
    private CausaRepository causaRepository;

    @Override
    public Causa save(Causa causa) {
        return causaRepository.save(causa);
    }

    @Override
    public List<Causa> findAll() {
        return causaRepository.findAll();
    }

    @Override
    public Optional<Causa> findById(String id) {
        return causaRepository.findById(id);
    }

    @Override
    public Causa update(Causa causa) {
        return causaRepository.save(causa);
    }

    @Override
    public void deleteById(String id) {
        causaRepository.deleteById(id);
    }
}
