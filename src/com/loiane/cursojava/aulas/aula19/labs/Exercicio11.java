package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int countpar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor");
            A[i] = scan.nextInt();
            if (A[i] % 2 == 0) {
                countpar++;
            }
        }

        System.out.println("A quantidade de elementos pares são: " + countpar);



    }
}
