package com.sistemaeducacional.model.entities;

import java.util.Date;

public class Aluno extends Usuario {
    private String ra;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private Date dataNascimento;

    public Aluno(String idUsuario, String nome, String cpf, String email, String tipo, String ra, String rua, String numero, String bairro, String cidade, Date dataNascimento) {
        super(idUsuario, nome, cpf, email, tipo);
        this.ra = ra;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\',' +
                "nome='" + getNome() + '\',' +
                "cpf='" + getCpf() + '\',' +
                "rua='" + rua + '\',' +
                "numero='" + numero + '\',' +
                "bairro='" + bairro + '\',' +
                "cidade='" + cidade + '\',' +
                "dataNascimento=" + dataNascimento +
                '}';
    }

