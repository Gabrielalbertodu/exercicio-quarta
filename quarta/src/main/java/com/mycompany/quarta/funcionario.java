/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quarta;

/**
 *
 * @author tulio
 */
public class funcionario extends pessoa {
    protected String cargo;
    protected String dataAdmissao;
    protected Double salario;

    public funcionario(String nome, int idade, String cpf, String cargo, String dataAdmissao, Double salario) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public funcionario() {
        super("", 0, ""); 
        this.cargo = "";
        this.dataAdmissao = "";
        this.salario = 0.0;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Data de Admissão: " + this.dataAdmissao);
        System.out.println("Salário: " + this.salario);
    }

    public Double calcularSalarioAnual() {
        return this.salario * 12;
    }

    public void receberAumento(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
    }

    public Double getSalario() {
        return salario;
    }
}
