package com.sistemaeducacional;

import com.sistemaeducacional.controller.AlunoController;
import com.sistemaeducacional.controller.UsuarioController;
import com.sistemaeducacional.model.entities.Aluno;
import com.sistemaeducacional.model.entities.Usuario;
import com.sistemaeducacional.view.MainView;

import java.util.Date;
import java.util.List;

public class MainApp {
    private UsuarioController usuarioController;
    private AlunoController alunoController;
    private MainView view;

    public MainApp() {
        usuarioController = new UsuarioController();
        alunoController = new AlunoController();
        view = new MainView();
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.run();
    }

    public void run() {
        int opcaoPrincipal;
        do {
            opcaoPrincipal = view.exibirMenuPrincipal();
            switch (opcaoPrincipal) {
                case 1:
                    gerenciarUsuarios();
                    break;
                case 2:
                    gerenciarAlunos();
                    break;
                case 0:
                    view.exibirMensagem("Saindo do sistema. Até mais!");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcaoPrincipal != 0);
        view.fecharScanner();
    }

    private void gerenciarUsuarios() {
        int opcaoUsuario;
        do {
            opcaoUsuario = view.exibirMenuUsuarios();
            switch (opcaoUsuario) {
                case 1:
                    String idUsuario = view.pedirIdUsuario();
                    String nomeUsuario = view.pedirNomeUsuario();
                    String cpfUsuario = view.pedirCpfUsuario();
                    String emailUsuario = view.pedirEmailUsuario();
                    String tipoUsuario = view.pedirTipoUsuario();
                    usuarioController.criarUsuario(idUsuario, nomeUsuario, cpfUsuario, emailUsuario, tipoUsuario);
                    break;
                case 2:
                    idUsuario = view.pedirIdUsuario();
                    Usuario usuario = usuarioController.buscarUsuario(idUsuario);
                    view.exibirDetalhesUsuario(usuario);
                    break;
                case 3:
                    List<Usuario> usuarios = usuarioController.listarUsuarios();
                    view.exibirListaUsuarios(usuarios);
                    break;
                case 4:
                    idUsuario = view.pedirIdUsuario();
                    nomeUsuario = view.pedirNomeUsuario();
                    cpfUsuario = view.pedirCpfUsuario();
                    emailUsuario = view.pedirEmailUsuario();
                    tipoUsuario = view.pedirTipoUsuario();
                    usuarioController.atualizarUsuario(idUsuario, nomeUsuario, cpfUsuario, emailUsuario, tipoUsuario);
                    break;
                case 5:
                    idUsuario = view.pedirIdUsuario();
                    usuarioController.removerUsuario(idUsuario);
                    break;
                case 9:
                    view.exibirMensagem("Voltando ao Menu Principal...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcaoUsuario != 9);
    }

    private void gerenciarAlunos() {
        int opcaoAluno;
        do {
            opcaoAluno = view.exibirMenuAlunos();
            switch (opcaoAluno) {
                case 1:
                    String idUsuario = view.pedirIdUsuario();
                    String nomeUsuario = view.pedirNomeUsuario();
                    String cpfUsuario = view.pedirCpfUsuario();
                    String emailUsuario = view.pedirEmailUsuario();
                    String tipoUsuario = view.pedirTipoUsuario();
                    String raAluno = view.pedirRaAluno();
                    String ruaAluno = view.pedirRuaAluno();
                    String numeroAluno = view.pedirNumeroAluno();
                    String bairroAluno = view.pedirBairroAluno();
                    String cidadeAluno = view.pedirCidadeAluno();
                    Date dataNascimentoAluno = view.pedirDataNascimentoAluno();
                    alunoController.criarAluno(idUsuario, nomeUsuario, cpfUsuario, emailUsuario, tipoUsuario, raAluno, ruaAluno, numeroAluno, bairroAluno, cidadeAluno, dataNascimentoAluno);
                    break;
                case 2:
                    raAluno = view.pedirRaAluno();
                    Aluno aluno = alunoController.buscarAluno(raAluno);
                    view.exibirDetalhesAluno(aluno);
                    break;
                case 3:
                    List<Aluno> alunos = alunoController.listarAlunos();
                    view.exibirListaAlunos(alunos);
                    break;
                case 4:
                    idUsuario = view.pedirIdUsuario();
                    nomeUsuario = view.pedirNomeUsuario();
                    cpfUsuario = view.pedirCpfUsuario();
                    emailUsuario = view.pedirEmailUsuario();
                    tipoUsuario = view.pedirTipoUsuario();
                    raAluno = view.pedirRaAluno();
                    ruaAluno = view.pedirRuaAluno();
                    numeroAluno = view.pedirNumeroAluno();
                    bairroAluno = view.pedirBairroAluno();
                    cidadeAluno = view.pedirCidadeAluno();
                    dataNascimentoAluno = view.pedirDataNascimentoAluno();
                    alunoController.atualizarAluno(idUsuario, nomeUsuario, cpfUsuario, emailUsuario, tipoUsuario, raAluno, ruaAluno, numeroAluno, bairroAluno, cidadeAluno, dataNascimentoAluno);
                    break;
                case 5:
                    raAluno = view.pedirRaAluno();
                    alunoController.removerAluno(raAluno);
                    break;
                case 9:
                    view.exibirMensagem("Voltando ao Menu Principal...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcaoAluno != 9);
    }
}

