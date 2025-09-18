package com.sistemaeducacional.model.dao;

import com.sistemaeducacional.model.entities.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos;

    public AlunoDAO() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarAlunoPorRa(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> listarTodosAlunos() {
        return new ArrayList<>(alunos);
    }

    public void atualizarAluno(Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(alunoAtualizado.getRa())) {
                alunos.set(i, alunoAtualizado);
                return;
            }
        }
    }

    public void removerAluno(String ra) {
        alunos.removeIf(aluno -> aluno.getRa().equals(ra));
    }
}

