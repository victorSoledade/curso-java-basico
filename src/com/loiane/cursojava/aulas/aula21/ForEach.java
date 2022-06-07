package com.loiane.cursojava.aulas.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        Random random = new Random();
        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor A com forEach");
        for (int nota : notas) {
            System.out.print(notas[nota] + " ");
        }
        System.out.println();

        /* Setar valores == For normal
        * Fazer output de valores == For Each!!!!!!!!!!!!!!!!
         */

        // exemplo 02
        System.out.println("Exemplo com arrys multidimensionais");

        int[][] notasAlunos = new int[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;


        for (int[] notasAluno : notasAlunos) {
            for (int nota : notasAluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}
