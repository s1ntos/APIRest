package com.api.tarefas.dto;


import jakarta.validation.constraints.*;

public class TarefaRequestDTO {

    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;

    private boolean completa;

    @Min(value = 0, message = "Hora mínima é 0")
    @Max(value = 23, message = "Hora máxima é 23")
    private int hora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
