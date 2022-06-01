package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i);
            A[i] = scan.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < A.length/2; i++) {
            if (A[i] != A[A.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println();

        if (palindromo) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

    }
}
