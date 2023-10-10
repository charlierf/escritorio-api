package com.adv.escritorio.service;

import com.adv.escritorio.model.Advogado;
import com.adv.escritorio.model.Pessoa;
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
    public Advogado findById(String id) {
        return advogadoRepository.findById(id).orElse(null);
    }

    @Override
    public Advogado update(Advogado updatedAdvogado) {

        String id = updatedAdvogado.getId();
        Advogado existingAdvogado = findById(id);

        if (existingAdvogado != null) {

            if (updatedAdvogado.getEspecialidades() != null) {
                existingAdvogado.setEspecialidades(updatedAdvogado.getEspecialidades());
            }

            if (updatedAdvogado.getRemuneracao() != null) {
                existingAdvogado.setRemuneracao(updatedAdvogado.getRemuneracao());
            }

            if (updatedAdvogado.getPessoa() != null) {
                existingAdvogado.setPessoa(updatedAdvogado.getPessoa());
            }

            if (updatedAdvogado.getEscritorio() != null) {
                existingAdvogado.setEscritorio(updatedAdvogado.getEscritorio());
            }

            return advogadoRepository.save(existingAdvogado);
        }

        return null;
    }

    @Override
    public void deleteById(String id) {
        advogadoRepository.deleteById(id);
    }
}
