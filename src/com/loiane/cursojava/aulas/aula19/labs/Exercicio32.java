package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i + " do vetor A");
            A[i] = scan.nextInt();
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < A.length+5; i++) {
            int result = A[0] * i;
            System.out.println(A[0] + " * " + i + " = " + result);
        }
        System.out.println();

        for (int i = 0; i < A.length+5; i++) {
            int result = A[1] * i;
            System.out.println(A[1] + " * " + i + " = " + result);
        }
        System.out.println();

        for (int i = 0; i < A.length+5; i++) {
            int result = A[2] * i;
            System.out.println(A[2] + " * " + i + " = " + result);
        }
        System.out.println();

        for (int i = 0; i < A.length+5; i++) {
            int result = A[3] * i;
            System.out.println(A[3] + " * " + i + " = " + result);
        }
        System.out.println();

        for (int i = 0; i < A.length+5; i++) {
            int result = A[4] * i;
            System.out.println(A[4] + " * " + i + " = " + result);
        }
        System.out.println();


    }
}
