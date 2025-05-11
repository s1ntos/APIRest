
package com.api.tarefas.model;

import org.springframework.stereotype.Component;
import jakarta.persistence.*;


@Component
@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;
    private boolean completa;
    private int hora;
    
    public Tarefa() {}

    public Tarefa(int id, String descricao, boolean completa, int hora) {
        this.id = id;
        this.descricao = descricao;
        this.completa = completa;
        this.hora = hora;
    }

    //getters e setters

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
