package com.sistemaeducacional.model.entities;

import java.util.Date;

public class Matricula {
    private String ra;
    private String idTurma;
    private String idCurso;
    private Date dataMatricula;

    public Matricula(String ra, String idTurma, String idCurso, Date dataMatricula) {
        this.ra = ra;
        this.idTurma = idTurma;
        this.idCurso = idCurso;
        this.dataMatricula = dataMatricula;
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

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "ra=\'" + ra + "\
                ", idTurma=\'" + idTurma + "\
                ", idCurso=\'" + idCurso + "\
                ", dataMatricula=" + dataMatricula +
                "}";
    }
}

