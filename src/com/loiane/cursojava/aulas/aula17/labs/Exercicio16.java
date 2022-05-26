package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long primeiroNumero = 1;
        long segundoNumero = 1;
        long proximo = 0;

        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);

        while (proximo <= 500){

            proximo = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximo;

            System.out.println(proximo);

        }


    }
}
