package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculado de celsius para Farenheit\n-------------------");

        System.out.println("Digite um valor em celsius: ");
        double grausCelsius = scan.nextDouble();
        double calculaGrausFarenheit = grausCelsius * 1.8 + 32;
        System.out.println(grausCelsius+" é "+calculaGrausFarenheit+" em Farenheit");
    }
}
