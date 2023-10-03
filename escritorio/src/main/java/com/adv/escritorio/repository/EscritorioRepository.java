package com.adv.escritorio.repository;

import com.adv.escritorio.model.Escritorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscritorioRepository extends JpaRepository<Escritorio, String> {
}
