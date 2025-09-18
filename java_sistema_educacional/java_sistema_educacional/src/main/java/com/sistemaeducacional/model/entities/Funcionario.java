package com.sistemaeducacional.model.entities;

public class Funcionario extends Usuario {
    private String idFuncionario;

    public Funcionario(String idUsuario, String nome, String cpf, String email, String tipo, String idFuncionario) {
        super(idUsuario, nome, cpf, email, tipo);
        this.idFuncionario = idFuncionario;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario='" + idFuncionario + "\'," +
                "nome='" + getNome() + "\'," +
                "cpf='" + getCpf() + "\'," +
                "email='" + getEmail() + "\'," +
                "tipo='" + getTipo() + "\'}';
    }
}

