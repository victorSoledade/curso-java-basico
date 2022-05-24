package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double ganhosPorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou: ");
        double horasTrabalhadas = scan.nextDouble();
        double salarioBruto = ganhosPorHora * horasTrabalhadas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("O salario Bruto: \n" + salarioBruto);
        System.out.println("Salario com desconto(líquido):");
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Imposto de renda: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
