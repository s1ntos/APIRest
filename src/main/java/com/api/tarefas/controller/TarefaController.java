package com.api.tarefas.controller;

import com.api.tarefas.dto.TarefaRequestDTO;
import com.api.tarefas.dto.TarefaResponseDTO;
import com.api.tarefas.mapper.TarefaMapper;
import com.api.tarefas.model.Tarefa;
import com.api.tarefas.service.TarefasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin(origins = "-")
public class TarefaController {

    @Autowired
    private TarefasService service;

    @PostMapping
    public ResponseEntity<TarefaResponseDTO> criar(@Valid @RequestBody TarefaRequestDTO dto) {
        Tarefa nova = TarefaMapper.toEntity(dto);
        Tarefa salva = service.criar(nova);
        return ResponseEntity.status(HttpStatus.CREATED).body(TarefaMapper.toResponseDTO(salva));
    }

    @GetMapping
    public ResponseEntity<List<TarefaResponseDTO>> listar() {
        List<Tarefa> tarefas = service.listar();
        List<TarefaResponseDTO> dtos = tarefas.stream()
                .map(TarefaMapper::toResponseDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaResponseDTO> buscar(@PathVariable int id) {
        Tarefa tarefa = service.buscarporid(id);
        if (tarefa == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(TarefaMapper.toResponseDTO(tarefa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TarefaResponseDTO> atualizar(@PathVariable int id, @Valid @RequestBody TarefaRequestDTO dto) {
        Tarefa atualizada = service.atualizar(id, TarefaMapper.toEntity(dto));
        if (atualizada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(TarefaMapper.toResponseDTO(atualizada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        boolean deletado = service.deletar(id);
        return deletado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}


