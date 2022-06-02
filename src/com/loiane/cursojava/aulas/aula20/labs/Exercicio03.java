package com.loiane.cursojava.aulas.aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite um valor para a matrix " + i + " " + j );
                numeros[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matriz ' Números ' = ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + contPar);
        System.out.println("Quantidade de impares: " + contImpar);



    }
}
