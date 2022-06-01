package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i + " do vetor A");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Analizando o numero " + A[i]);

            for (int j = 2; j < A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }
            System.out.println();
        }



    }
}
