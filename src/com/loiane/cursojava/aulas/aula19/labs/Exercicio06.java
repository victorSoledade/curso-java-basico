package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um numero");
            A[i] = scan.nextInt();
        }
        System.out.println("\nVetor B\n");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite outro numero");
            B[i] = scan.nextInt();
            C[i] =  A[i] + B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println("O indice " + (i+1) + " do vetor C = " + C[i]);
        }

    }
}
