package com.adv.escritorio.service;

import com.adv.escritorio.model.Advogado;
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
    public Causa findById(String id) {
        return causaRepository.findById(id).orElse(null);
    }

    @Override
    public Causa update(Causa updatedCausa) {
        String id = updatedCausa.getIdDemanda().toString();
        Causa existingCausa = findById(id);

        if (existingCausa != null) {

            if (updatedCausa.getAdvogado() != null) {
                existingCausa.setAdvogado(updatedCausa.getAdvogado());
            }

            if (updatedCausa.getEscritorio() != null) {
                existingCausa.setEscritorio(updatedCausa.getEscritorio());
            }

            return causaRepository.save(existingCausa);
        }

        return null;
    }

    @Override
    public void deleteById(String id) {
        causaRepository.deleteById(id);
    }
}
