package com.sistemaeducacional.view;

import com.sistemaeducacional.model.entities.Usuario;
import com.sistemaeducacional.model.entities.Aluno;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class MainView {
    private Scanner scanner;

    public MainView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenuPrincipal() {
        System.out.println("\n--- Sistema de Gestão Educacional ---");
        System.out.println("1. Gerenciar Usuários");
        System.out.println("2. Gerenciar Alunos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int exibirMenuUsuarios() {
        System.out.println("\n--- Gerenciar Usuários ---");
        System.out.println("1. Criar Usuário");
        System.out.println("2. Buscar Usuário por ID");
        System.out.println("3. Listar Todos os Usuários");
        System.out.println("4. Atualizar Usuário");
        System.out.println("5. Remover Usuário");
        System.out.println("9. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int exibirMenuAlunos() {
        System.out.println("\n--- Gerenciar Alunos ---");
        System.out.println("1. Criar Aluno");
        System.out.println("2. Buscar Aluno por RA");
        System.out.println("3. Listar Todos os Alunos");
        System.out.println("4. Atualizar Aluno");
        System.out.println("5. Remover Aluno");
        System.out.println("9. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Métodos para entrada de dados de Usuário
    public String pedirIdUsuario() { System.out.print("ID do Usuário: "); return scanner.nextLine(); }
    public String pedirNomeUsuario() { System.out.print("Nome do Usuário: "); return scanner.nextLine(); }
    public String pedirCpfUsuario() { System.out.print("CPF do Usuário: "); return scanner.nextLine(); }
    public String pedirEmailUsuario() { System.out.print("Email do Usuário: "); return scanner.nextLine(); }
    public String pedirTipoUsuario() { System.out.print("Tipo do Usuário (Aluno, Professor, Funcionario): "); return scanner.nextLine(); }

    // Métodos para entrada de dados de Aluno
    public String pedirRaAluno() { System.out.print("RA do Aluno: "); return scanner.nextLine(); }
    public String pedirRuaAluno() { System.out.print("Rua do Aluno: "); return scanner.nextLine(); }
    public String pedirNumeroAluno() { System.out.print("Número do Aluno: "); return scanner.nextLine(); }
    public String pedirBairroAluno() { System.out.print("Bairro do Aluno: "); return scanner.nextLine(); }
    public String pedirCidadeAluno() { System.out.print("Cidade do Aluno: "); return scanner.nextLine(); }
    public Date pedirDataNascimentoAluno() {
        System.out.print("Data de Nascimento do Aluno (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Usando data atual.");
            return new Date();
        }
    }

    // Métodos para exibir informações
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirDetalhesUsuario(Usuario usuario) {
        if (usuario != null) {
            System.out.println("\n--- Detalhes do Usuário ---");
            System.out.println("ID: " + usuario.getIdUsuario());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Tipo: " + usuario.getTipo());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void exibirListaUsuarios(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\n--- Lista de Usuários ---");
            for (Usuario u : usuarios) {
                System.out.println(u.toString());
            }
        }
    }

    public void exibirDetalhesAluno(Aluno aluno) {
        if (aluno != null) {
            System.out.println("\n--- Detalhes do Aluno ---");
            System.out.println("RA: " + aluno.getRa());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Tipo: " + aluno.getTipo());
            System.out.println("Rua: " + aluno.getRua());
            System.out.println("Número: " + aluno.getNumero());
            System.out.println("Bairro: " + aluno.getBairro());
            System.out.println("Cidade: " + aluno.getCidade());
            System.out.println("Data de Nascimento: " + new SimpleDateFormat("dd/MM/yyyy").format(aluno.getDataNascimento()));
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void exibirListaAlunos(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("\n--- Lista de Alunos ---");
            for (Aluno a : alunos) {
                System.out.println(a.toString());
            }
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}

