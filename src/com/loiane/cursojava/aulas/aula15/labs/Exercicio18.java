package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Saiba se o número é par ou ímpar: ");

        double numero = scan.nextDouble();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par");
        } else {
            System.out.println(numero + " não é um número par");
        }

    }
}
