package com.project.gerenciador_desafios.controller;

import com.project.gerenciador_desafios.enums.StatusDesafio;
import com.project.gerenciador_desafios.model.Desafio;
import com.project.gerenciador_desafios.service.DesafioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desafios")
public class DesafioController {

    private final DesafioService desafioService;

    public DesafioController(DesafioService desafioService) {
        this.desafioService = desafioService;
    }

    @GetMapping
    public List<Desafio> listarTodos() {
        return desafioService.listarDesafios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Desafio> buscarPorId(@PathVariable Long id) {
        Desafio desafio = desafioService.buscarDesafioPorId(id);
        return desafio != null ? ResponseEntity.ok(desafio) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Desafio salvar(@RequestBody Desafio desafio) {
        return desafioService.salvarDesafio(desafio);
    }

    @PutMapping("/{id}/status/{statusDesafio}")
    public ResponseEntity<Void> atualizarStatus(@PathVariable Long id, @PathVariable StatusDesafio statusDesafio) {
        desafioService.atualizarStatus(id, statusDesafio);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        try {
            desafioService.deletarDesafio(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
