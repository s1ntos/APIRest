package com.api.tarefas.controller;

import com.api.tarefas.model.Tarefa;
import com.api.tarefas.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que essa classe é um controller REST
@CrossOrigin(origins = "*") // Permite requisições de qualquer origem (CORS)
@RequestMapping("/tarefas") // Define o caminho base da API
public class TarefaController {

    @Autowired
    private TarefasService service;

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa) {
        Tarefa nova = service.criar(tarefa);
        return ResponseEntity.status(HttpStatus.CREATED).body(nova);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> buscarTarefas() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefa(@PathVariable int id) {
        Tarefa tarefa = service.buscarporid(id);
        return (tarefa != null) ? ResponseEntity.ok(tarefa) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable int id, @RequestBody Tarefa tarefa) {
        Tarefa atualizada = service.atualizar(id, tarefa);
        return (atualizada != null) ? ResponseEntity.ok(atualizada) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable int id) {
        boolean deletado = service.deletar(id);
        return deletado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}


