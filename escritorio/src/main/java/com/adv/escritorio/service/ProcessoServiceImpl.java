package com.adv.escritorio.service;

import com.adv.escritorio.model.Processo;
import com.adv.escritorio.repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessoServiceImpl implements ProcessoService{
    @Autowired
    private ProcessoRepository processoRepository;

    @Override
    public Processo save(Processo processo) {
        return processoRepository.save(processo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Processo> findAll() {
        return processoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Processo> findById(String id) {
        return processoRepository.findById(id);
    }

    @Override
    public Processo update(Processo processo) {
        return processoRepository.save(processo);
    }

    @Override
    public void deleteById(String id) {
        processoRepository.deleteById(id);
    }
}
