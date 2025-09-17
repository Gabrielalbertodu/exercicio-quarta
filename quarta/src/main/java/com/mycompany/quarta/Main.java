/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quarta;

/**
 *
 * @author tulio
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Testando Pessoa ---");
        pessoa pessoa1 = new pessoa("Maria Silva", 30, "111.222.333-44");
        pessoa1.mostrarDados();
        System.out.println();

        System.out.println("--- Testando Funcionario ---");
        funcionario funcionario1 = new funcionario("Joao Souza", 25, "555.666.777-88", "Desenvolvedor", "01/01/2023", 3000.00);
        funcionario1.mostrarDados();
        System.out.println("Salario Anual: " + funcionario1.calcularSalarioAnual());
        funcionario1.receberAumento(10);
        System.out.println("Salario apos aumento: " + funcionario1.getSalario());
        System.out.println();

        System.out.println("--- Testando Gerente ---");
        Gerente gerente1 = new Gerente("Ana Paula", 40, "999.888.777-66", "Gerente de Projetos", "15/03/2020", 8000.00, 5, 1000.00);
        gerente1.mostrarDados();
        System.out.println("Salario com Bonus: " + gerente1.calcularSalarioComBonus());
        gerente1.gerenciarEquipe();
        System.out.println();
    }
}
