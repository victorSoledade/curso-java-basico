package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[15];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digiteu um valor");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = 1;
            for (int j = 1; j <= A[i]; j++) {
                B[i] *= j;
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
        
    }
}
