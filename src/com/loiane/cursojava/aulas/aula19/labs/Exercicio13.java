package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i);
            A[i] = scan.nextInt();
            soma += A[i];
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("A soma de todos valores é: " + soma);



    }
}
