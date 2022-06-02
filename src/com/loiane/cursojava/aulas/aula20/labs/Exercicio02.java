package com.loiane.cursojava.aulas.aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random numeroRandom = new Random();

        int[][] numerosAleatorios = new int[10][10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(10);
            }
        }

        System.out.println("Matriz = ");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int menorL5 = Integer.MAX_VALUE;
        int maiorL5 = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) { // numerosAleatorios[i].length (maybe)
            if (numerosAleatorios[5][i] < menorL5) {
                menorL5 = numerosAleatorios[5][i];
            }
            if (numerosAleatorios[5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[5][i];
            }
        }

        int menorC7 = Integer.MAX_VALUE;
        int maiorC7 = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][7] < menorC7) {
                menorC7 = numerosAleatorios[i][7];
            }
            if (numerosAleatorios[i][7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][7];
            }
        }

        System.out.println("Menor valor da linha 5 = " + menorL5);
        System.out.println("Maior valor da linha 5 = " + maiorL5);

        System.out.println("Menor valor da coluna 7 = " + menorC7);
        System.out.println("Maior valor da coluna 7 = " + maiorC7);

    }
}
