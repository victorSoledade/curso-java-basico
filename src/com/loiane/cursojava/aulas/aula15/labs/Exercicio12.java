package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Programa paga cálculo de folha de pagamento");

        System.out.println("Digite seu ganho por hora");
        double valorHora = scan.nextDouble();
        System.out.println("Digite quantas horas você trabalhou");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        if (salarioBruto <= 900) {
            System.out.println("Seu salário é de R$" + salarioBruto + " você está insento de impostos.");

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            double salarioLiquido = salarioBruto - (salarioBruto * 0.05);
            System.out.println("Você recebeu -5% de desconto, seu salário de R$"+salarioBruto+" foi para R$"+salarioLiquido);
            salarioLiquido = salarioBruto - (salarioLiquido * 0.10);
            System.out.println("Mais os descontos do INSS " + salarioLiquido);
            salarioLiquido = salarioBruto + (salarioLiquido * 0.11);
            System.out.println("Somado com um pequeno aumento do FGTS "+salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            double salarioLiquido = salarioBruto - salarioBruto * 0.10;
            System.out.println("Você recebeu -10% de desconto, seu salário de R$"+salarioBruto+" foi para R$"+salarioLiquido);
        } else if (salarioBruto > 2500) {
            double salarioLiquido = salarioBruto - salarioBruto * 0.20;
            System.out.println("Você recebeu -20% de desconto, seu salário de R$"+salarioBruto+" foi para R$"+salarioLiquido);
        }


    }
}
