package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite valores para preencher o vetor A");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor inteiro");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = A[i];
        }
        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Outra forma

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite valores para preencher o vetor");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}
