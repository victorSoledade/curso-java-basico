package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber o valor do seu fatorial");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);


    }
}
