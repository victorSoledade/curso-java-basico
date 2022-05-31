package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int countMultiplo5 = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o indice " + i);
            A[i] = scan.nextInt();
            if (A[i] % 5 == 0) {
                countMultiplo5++;
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Valores múltiplos de cinco: " + countMultiplo5);


    }
}
