package com.project.gerenciador_desafios.service;

import com.project.gerenciador_desafios.enums.StatusDesafio;
import com.project.gerenciador_desafios.model.Desafio;
import com.project.gerenciador_desafios.repository.DesafioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesafioService {

    private final DesafioRepository desafioRepository;

    public DesafioService(DesafioRepository desafioRepository) {
        this.desafioRepository = desafioRepository;
    }

    public List<Desafio> listarDesafios() {
        return desafioRepository.findAll();
    }

    public Desafio buscarDesafioPorId(Long id) {
        return desafioRepository.findById(id).orElse(null);
    }

    public Desafio salvarDesafio(Desafio desafio) {
        return desafioRepository.save(desafio);
    }

    public void atualizarStatus(Long id, StatusDesafio statusDesafio) {
        Desafio desafio = desafioRepository.findById(id).orElse(null);
        if (desafio != null) {
            desafio.setStatus(statusDesafio);
            desafioRepository.save(desafio);
        }
    }

    public void deletarDesafio(Long id) {
        desafioRepository.deleteById(id);
    }
}
