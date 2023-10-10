package com.adv.escritorio.service;

import com.adv.escritorio.model.Pessoa;
import com.adv.escritorio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Pessoa findById(String id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    @Override
    public Pessoa update(Pessoa updatedPessoa) {
        String id = updatedPessoa.getId();
        Pessoa existingPessoa = findById(id);

        if (existingPessoa != null) {

            if (updatedPessoa.getEndereco() != null) {
                existingPessoa.setEndereco(updatedPessoa.getEndereco());
            }

            if (updatedPessoa.getTelefone() != null) {
                existingPessoa.setTelefone(updatedPessoa.getTelefone());
            }

            if (updatedPessoa.getEmail() != null) {
                existingPessoa.setEmail(updatedPessoa.getEmail());
            }

            if (updatedPessoa.getNome() != null) {
                existingPessoa.setNome(updatedPessoa.getNome());
            }

            if (updatedPessoa.getSobrenome() != null) {
                existingPessoa.setSobrenome(updatedPessoa.getSobrenome());
            }

            return pessoaRepository.save(existingPessoa);
        }

        return null;
    }

    @Override
    public void deleteById(String id) {
        pessoaRepository.deleteById(id);
    }
}
