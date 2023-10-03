package com.adv.escritorio.service;

import com.adv.escritorio.model.Pessoa;
import com.adv.escritorio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService{
    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<Pessoa> findById(String id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public Pessoa update(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public void deleteById(String id) {
        pessoaRepository.deleteById(id);
    }
}
