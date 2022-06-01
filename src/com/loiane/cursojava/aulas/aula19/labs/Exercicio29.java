package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[B.length * 2];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor do indice " + i + " do vetor A");
            A[i] = scan.nextInt();
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite o valor do indice " + i + " do vetor B");
            B[i] = scan.nextInt();
            C[A.length + i] = B[i];
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
