package com.api.tarefas.mapper;

import com.api.tarefas.dto.*;
import com.api.tarefas.model.Tarefa;

public class TarefaMapper {

    public static Tarefa toEntity(TarefaRequestDTO dto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setHora(dto.getHora()); // hora agora é int
        tarefa.setCompleta(dto.isCompleta());
        return tarefa;
    }

    public static TarefaResponseDTO toResponseDTO(Tarefa tarefa) {
        TarefaResponseDTO dto = new TarefaResponseDTO();
        dto.setId(tarefa.getId());
        dto.setDescricao(tarefa.getDescricao());
        dto.setHora(tarefa.getHora()); // hora agora é int
        dto.setCompleta(tarefa.isCompleta());
        return dto;
    }
}

