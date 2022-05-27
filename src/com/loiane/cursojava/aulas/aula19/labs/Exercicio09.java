package com.loiane.cursojava.aulas.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        float[] C = new float[B.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um numero inteiro");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite um numero inteiro");
            B[i] = scan.nextInt();
            C[i] = (float)A[i] / B[i];
        }

        System.out.println("Vetor A");
        for (int j : A) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Vetor B");
        for (int j : B) {
            System.out.print(j + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println("Vetor C");
        for (float j : C) {
            System.out.print(df.format(j) + " ");
        }


    }
}
