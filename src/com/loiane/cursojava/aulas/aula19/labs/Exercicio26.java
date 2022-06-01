package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o vetor A o index " + i);
            A[i] = scan.nextInt();
            System.out.println("Digite um valor para o vetor B o index " + i);
            B[i] = scan.nextInt();
            if (A[i] == B[i]) {
                C[i] = 0;
            } else if (A[i] > B[i]) {
                C[i] = 1;
            } else {
                C[i] = -1;
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
