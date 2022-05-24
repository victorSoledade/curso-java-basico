package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números para saber qual é o maior deles: ");

        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O maior numero é o "+ numero1);
        }
        else {
            System.out.println("Eles são iguais");
        }

    }
}
