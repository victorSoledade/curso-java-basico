package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] A = new double[20];
        double cotacao;


        System.out.println("Entre com a cotacao do dolar");
        cotacao = scan.nextDouble();

        for (int i = 0; i < A.length; i++) {
            A[i] = cotacao * (i+1);
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }
}
