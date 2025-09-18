package com.sistemaeducacional.model.entities;

public class Curso {
    private String idCurso;
    private String nome;
    private int cargaHoraria;
    private String modalidade;

    public Curso(String idCurso, String nome, int cargaHoraria, String modalidade) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
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

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=\'" + idCurso + "\', " +
                "nome=\'" + nome + "\', " +
                "cargaHoraria=" + cargaHoraria +
                ", modalidade=\'" + modalidade + "\'" +
                '}';
    }
}

