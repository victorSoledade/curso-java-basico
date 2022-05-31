package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int countMaior35 = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor");
            A[i] = scan.nextInt();
            if (A[i] > 35) {
                countMaior35++;
            }
        }

        System.out.println("Vetor A =");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de pessoas com idade maior que 35: " + countMaior35);

    }
}
