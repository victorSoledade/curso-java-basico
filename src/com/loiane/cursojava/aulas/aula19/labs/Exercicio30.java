package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[20];
        int[] B = new int[A.length];
        int[] C = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para compor o index " + i + " do array A");
            A[i] = scan.nextInt();
            if (A[i] % 2 == 0) {
                B[i] = A[i];
            } else {
                C[i] = A[i];
            }
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

        System.out.println("Vetor C = ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();

    }
}
