package com.sistemaeducacional.model.dao;

import com.sistemaeducacional.model.entities.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> usuarios;

    public UsuarioDAO() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorId(String idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> listarTodosUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public void atualizarUsuario(Usuario usuarioAtualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdUsuario().equals(usuarioAtualizado.getIdUsuario())) {
                usuarios.set(i, usuarioAtualizado);
                return;
            }
        }
    }

    public void removerUsuario(String idUsuario) {
        usuarios.removeIf(usuario -> usuario.getIdUsuario().equals(idUsuario));
    }
}

