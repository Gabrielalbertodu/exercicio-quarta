package com.sistemaeducacional.controller;

import com.sistemaeducacional.model.dao.UsuarioDAO;
import com.sistemaeducacional.model.entities.Usuario;
import java.util.List;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void criarUsuario(String idUsuario, String nome, String cpf, String email, String tipo) {
        Usuario novoUsuario = new Usuario(idUsuario, nome, cpf, email, tipo);
        usuarioDAO.adicionarUsuario(novoUsuario);
        System.out.println("Usuario " + nome + " criado com sucesso.");
    }

    public Usuario buscarUsuario(String idUsuario) {
        return usuarioDAO.buscarUsuarioPorId(idUsuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarTodosUsuarios();
    }

    public void atualizarUsuario(String idUsuario, String nome, String cpf, String email, String tipo) {
        Usuario usuarioAtualizado = new Usuario(idUsuario, nome, cpf, email, tipo);
        usuarioDAO.atualizarUsuario(usuarioAtualizado);
        System.out.println("Usuario " + nome + " atualizado com sucesso.");
    }

    public void removerUsuario(String idUsuario) {
        usuarioDAO.removerUsuario(idUsuario);
        System.out.println("Usuario com ID " + idUsuario + " removido com sucesso.");
    }
}

