package com.sistemaeducacional.model.entities;

public class Disciplina {
    private String idDisciplina;
    private String nome;
    private int cargaHoraria;
    private String ementa;

    public Disciplina(String idDisciplina, String nome, int cargaHoraria, String ementa) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "idDisciplina=\'" + idDisciplina + "\
                ", nome=\'" + nome + "\
                ", cargaHoraria=" + cargaHoraria +
                ", ementa=\'" + ementa + "\"}";
    }
}

