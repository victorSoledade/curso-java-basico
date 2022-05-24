package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um salário para descobrir seu aumento");
        System.out.println("Digite um salário: ");
        double salario = scan.nextDouble();

        if (salario <= 280) {
            double salarioNovo = salario + salario * 0.2;
            System.out.println("O salário antes era de R$"+salario+" agora é de R$"+salarioNovo+" com 20% de aumento");
        } else if (salario > 280 && salario <= 700) {
            double salarioNovo = salario + salario * 0.15;
            System.out.println("O salário antes era de R$"+salario+" agora é de R$"+salarioNovo+" com 15% de aumento");
        } else if (salario > 700 && salario <= 1500) {
            double salarioNovo = salario + salario * 0.1;
            System.out.println("O salário antes era de R$"+salario+" agora é de R$"+salarioNovo+" com 10% de aumento");
        } else if (salario > 1500) {
            double salarioNovo = salario + salario * 0.05;
            System.out.println("O salário antes era de R$"+salario+" agora é de R$"+salarioNovo+" com 10% de aumento");
        }

    }
}
