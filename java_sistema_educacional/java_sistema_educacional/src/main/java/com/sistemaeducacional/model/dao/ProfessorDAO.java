package com.sistemaeducacional.model.dao;

import com.sistemaeducacional.model.entities.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    private List<Professor> professores;

    public ProfessorDAO() {
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public Professor buscarProfessorPorId(String idProfessor) {
        for (Professor professor : professores) {
            if (professor.getIdProfessor().equals(idProfessor)) {
                return professor;
            }
        }
        return null;
    }

    public List<Professor> listarTodosProfessores() {
        return new ArrayList<>(professores);
    }

    public void atualizarProfessor(Professor professorAtualizado) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getIdProfessor().equals(professorAtualizado.getIdProfessor())) {
                professores.set(i, professorAtualizado);
                return;
            }
        }
    }

    public void removerProfessor(String idProfessor) {
        professores.removeIf(professor -> professor.getIdProfessor().equals(idProfessor));
    }
}

