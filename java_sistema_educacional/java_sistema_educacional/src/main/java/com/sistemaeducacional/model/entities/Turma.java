package com.sistemaeducacional.model.entities;

public class Turma {
    private String idTurma;
    private String idCurso;
    private String idProfessor;
    private String idDisciplina;
    private int ano;
    private int semestre;
    private String turno;

    public Turma(String idTurma, String idCurso, String idProfessor, String idDisciplina, int ano, int semestre, String turno) {
        this.idTurma = idTurma;
        this.idCurso = idCurso;
        this.idProfessor = idProfessor;
        this.idDisciplina = idDisciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.turno = turno;
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

    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "idTurma=\'" + idTurma + "\'," +
                "idCurso=\'" + idCurso + "\'," +
                "idProfessor=\'" + idProfessor + "\'," +
                "idDisciplina=\'" + idDisciplina + "\'," +
                "ano=" + ano +
                ", semestre=" + semestre +
                ", turno=\'" + turno + "\'" +
                '}';
    }
}

