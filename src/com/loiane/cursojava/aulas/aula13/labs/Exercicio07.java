package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double ganhosPorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou: ");
        double horasTrabalhadas = scan.nextDouble();
        double salarioDoMes = ganhosPorHora * horasTrabalhadas;
        System.out.println("Esse mês você receberá: "+salarioDoMes);
    }
}
