package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor");
            A[i] = scan.nextInt();
            B[i] = A[i] % 2;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }


    }
}
