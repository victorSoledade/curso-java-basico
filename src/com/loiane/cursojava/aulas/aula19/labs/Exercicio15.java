package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int countImpar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i);
            A[i] = scan.nextInt();
            if (A[i] % 2 != 0) {
                countImpar++;
            }
        }

        double countPares = A.length - countImpar;

        double percentPar = (countPares * 100) / A.length;

        double percentImpar = 100 - percentPar;

        System.out.println("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("Percent pares: " + percentPar);
        System.out.println("Percent impares: " + percentImpar);




    }
}
