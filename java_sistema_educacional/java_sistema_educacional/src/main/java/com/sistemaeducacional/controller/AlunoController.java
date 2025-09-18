package com.sistemaeducacional.controller;

import com.sistemaeducacional.model.dao.AlunoDAO;
import com.sistemaeducacional.model.entities.Aluno;
import java.util.Date;
import java.util.List;

public class AlunoController {
    private AlunoDAO alunoDAO;

    public AlunoController() {
        this.alunoDAO = new AlunoDAO();
    }

    public void criarAluno(String idUsuario, String nome, String cpf, String email, String tipo, String ra, String rua, String numero, String bairro, String cidade, Date dataNascimento) {
        Aluno novoAluno = new Aluno(idUsuario, nome, cpf, email, tipo, ra, rua, numero, bairro, cidade, dataNascimento);
        alunoDAO.adicionarAluno(novoAluno);
        System.out.println("Aluno " + nome + " criado com sucesso.");
    }

    public Aluno buscarAluno(String ra) {
        return alunoDAO.buscarAlunoPorRa(ra);
    }

    public List<Aluno> listarAlunos() {
        return alunoDAO.listarTodosAlunos();
    }

    public void atualizarAluno(String idUsuario, String nome, String cpf, String email, String tipo, String ra, String rua, String numero, String bairro, String cidade, Date dataNascimento) {
        Aluno alunoAtualizado = new Aluno(idUsuario, nome, cpf, email, tipo, ra, rua, numero, bairro, cidade, dataNascimento);
        alunoDAO.atualizarAluno(alunoAtualizado);
        System.out.println("Aluno " + nome + " atualizado com sucesso.");
    }

    public void removerAluno(String ra) {
        alunoDAO.removerAluno(ra);
        System.out.println("Aluno com RA " + ra + " removido com sucesso.");
    }
}

