package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números para saber qual o maior deles: ");

        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double numero3 = scan.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("o número " + numero1 + " é o maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é o maior");
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("O numero " + numero3 + " é o maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
