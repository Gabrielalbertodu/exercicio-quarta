/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quarta;

/**
 *
 * @author tulio
 */
public class Gerente extends funcionario {

    private final int equipe;
    private final double bonus;

    protected Gerente(String nome, int idade, String cpf, String cargo, String Datadmissao, double salario, int equipe, double bonus) {
        super(nome, idade, cpf, cargo, Datadmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public double calcularSalarioComBonus() {
        return this.salario + this.bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando equipe de " + equipe + " membros.");
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Equipe: " + equipe);
        System.out.println("Bonus: " + bonus);
    }
}
