package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int resultado;

        System.out.println("Digite um número para liberar sua tabuada");
        numero = scan.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("Ocorreu um erro");
            return;
        }

        for (int i = 1; i < 10; i++ ) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
