package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio32b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i + " do vetor A");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("Tabuada do " + A[i]);
            for (int j = 0; j < 10; j++) {
                System.out.println(j + " * " + A[i] + " = " + (A[i] * j));
            }
        }
        System.out.println();
        
        
        
    }
}
