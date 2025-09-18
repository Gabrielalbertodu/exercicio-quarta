package com.sistemaeducacional.model.entities;

import java.util.Date;

public class Nota {
    private String idNota;
    private String ra;
    private String idTurma;
    private String idCurso;
    private float valor;
    private Date data;

    public Nota(String idNota, String ra, String idTurma, String idCurso, float valor, Date data) {
        this.idNota = idNota;
        this.ra = ra;
        this.idTurma = idTurma;
        this.idCurso = idCurso;
        this.valor = valor;
        this.data = data;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "idNota=\'" + idNota + "\
                ", ra=\'" + ra + "\
                ", idTurma=\'" + idTurma + "\
                ", idCurso=\'" + idCurso + "\
                ", valor=" + valor +
                ", data=" + data +
                "}";
    }
}

