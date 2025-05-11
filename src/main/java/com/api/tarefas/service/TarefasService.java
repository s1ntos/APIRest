package com.api.tarefas.service;

import com.api.tarefas.model.Tarefa;
import com.api.tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que essa classe contém a logica de negocio
public class TarefasService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarporid(int id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public Tarefa atualizar(int id, Tarefa dados) {
        Tarefa tarefa = buscarporid(id);
        if(tarefa != null) {
            tarefa.setDescricao(dados.getDescricao());
            tarefa.setCompleta(dados.isCompleta());
            tarefa.setHora(dados.getHora());
            return tarefaRepository.save(tarefa);
        }
        return null;
    }

    public boolean deletar(int id) {
        if(tarefaRepository.existsById(id)) {
            tarefaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
