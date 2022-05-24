package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calcular área do quadrado");
        System.out.println("Me dê o valor dos lados");
        double lado = scan.nextDouble();
        double calculoArea = lado * lado;
        System.out.println("A área é de: " + calculoArea);
        double doubroDaArea = calculoArea * 2;
        System.out.println("O dobro é: " + doubroDaArea);
    }
}
