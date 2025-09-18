package com.sistemaeducacional.model.entities;

public class Professor extends Usuario {
    private String idProfessor;
    private String formacao;

    public Professor(String idUsuario, String nome, String cpf, String email, String tipo, String idProfessor, String formacao) {
        super(idUsuario, nome, cpf, email, tipo);
        this.idProfessor = idProfessor;
        this.formacao = formacao;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor='" + idProfessor + "\'," +
                "nome='" + getNome() + "\'," +
                "formacao='" + formacao + "\'" +
                '}';
    }
}

