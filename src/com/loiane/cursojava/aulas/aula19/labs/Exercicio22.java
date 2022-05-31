package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int count0 = 0;
        int count1 = 0;


        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random() * 1);

            if (A[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        double percent0 = (count0 * 100) / A.length;
        double percent1 = (count1 * 100) / A.length;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Percent de 0: " + percent0 );
        System.out.println("Percent de 1: " + percent1 );

    }
}
