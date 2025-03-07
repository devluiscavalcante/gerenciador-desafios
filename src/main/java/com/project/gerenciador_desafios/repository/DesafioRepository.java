package com.project.gerenciador_desafios.repository;

import com.project.gerenciador_desafios.model.Desafio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesafioRepository extends JpaRepository<Desafio, Long> {
    List<Desafio> findByStatus(com.project.gerenciador_desafios.enums.StatusDesafio statusDesafio);
}
