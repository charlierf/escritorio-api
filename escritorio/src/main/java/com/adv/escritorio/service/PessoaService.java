package com.adv.escritorio.service;

import com.adv.escritorio.model.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa save(Pessoa pessoa);

    List<Pessoa> findAll();

    Pessoa findById(String id);

    Pessoa update(Pessoa pessoa);

    void deleteById(String id);
}
