package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor");
            A[i] = scan.nextInt();
            if (A[i] % 2 != 0) {
                break;
            }
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // com flags

//        System.out.println("Fazendo com flags!\n===============");
//
//        int[] vetorA = new int[10];
//        boolean valido = false;
//
//        do {
//            for (int i = 0; i < vetorA.length; i++) {
//                System.out.println("Digite um valor");
//                A[i] = scan.nextInt();
//                if (A[i] % 2 != 0) {
//                    valido = false;
//                } else {
//                    valido = true;
//                }
//            }
//        } while (!valido);
//
//
//        System.out.println("Vetor A = ");
//        for (int i = 0; i < vetorA.length; i++) {
//            System.out.print(A[i] + " ");
//        }


    }
}
