package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número para gerara a Fibonnaci");
        long n = scan.nextInt();
        long primeiroNumero = 1;
        long segundoNumero = 1;
        long proximo;

        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);

        for (int i = 0; i < n; i++) {

            proximo = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximo;

            System.out.println(proximo);

        }

    }
}
