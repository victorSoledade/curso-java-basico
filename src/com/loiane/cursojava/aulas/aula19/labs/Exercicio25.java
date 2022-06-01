package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor");
            A[i] = scan.nextInt();
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            } // com ternário = B[i] = (A[i] % 2 == 0) ? 1 : 0;
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

    }
}
