package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um numero");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite um numero");
            B[i] = scan.nextInt();
            C[i] = A[i] * B[i];
        }

        for (int j : A) {
            System.out.print("VetA = " + j + " ");
        }
        System.out.println();

        for (int j : B) {
            System.out.print("VetB = " + j + " ");
        }
        System.out.println();

        for (int j : C) {
            System.out.print("VetC = " + j + " ");
        }



    }
}
