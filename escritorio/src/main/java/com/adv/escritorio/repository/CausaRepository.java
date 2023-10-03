package com.adv.escritorio.repository;

import com.adv.escritorio.model.Causa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface CausaRepository extends JpaRepository<Causa, String> {
}
