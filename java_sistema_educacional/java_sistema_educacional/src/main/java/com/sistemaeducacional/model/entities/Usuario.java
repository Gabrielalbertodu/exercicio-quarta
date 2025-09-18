package com.sistemaeducacional.model.entities;

public class Usuario {
    private String idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String tipo;

    public Usuario(String idUsuario, String nome, String cpf, String email, String tipo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tipo = tipo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
               "idUsuario=\'" + idUsuario + "\'," +
               "nome=\'" + nome + "\'," +
               "cpf=\'" + cpf + "\'," +
               "email=\'" + email + "\'," +
               "tipo=\'" + tipo + "\'}";
    }
}

