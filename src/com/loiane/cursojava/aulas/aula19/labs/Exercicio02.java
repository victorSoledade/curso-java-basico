package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[A.length];


        System.out.println("Digite valores para preencher o vetor A");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um número inteiro");
            A[i] = scan.nextInt();
            B[i] = A[i] * 2;
        }

        for (int j : B) {
            System.out.println(" | Vetor B: " + j);
        }


    }
}
