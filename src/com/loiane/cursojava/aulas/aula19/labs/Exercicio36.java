package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] A = new double[11];

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.pow(2, i);
        }

        System.out.println("Vetor A =");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
