package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor: ");
            A[i] = scan.nextInt();
            B[i] = A[i] * A[i];
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("| Valor do indíce " + (i+1) + " do vetor B = " + B[i]);
        }



    }
}
