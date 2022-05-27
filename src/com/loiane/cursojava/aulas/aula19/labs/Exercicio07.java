package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o indice " + i + " do vetor A");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite um valor para o indice " + i + " do vetor B");
            B[i] = scan.nextInt();
            C[i] = A[i] - B[i];
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print("A indice " +i+" = " + A[i]);
            System.out.println();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.print("B indice " +i+" = " + B[i]);
            System.out.println();
        }

        for (int i = 0; i < C.length; i++) {
            System.out.print("C indice " +i+" = " + C[i]);
            System.out.println();
        }


    }
}
