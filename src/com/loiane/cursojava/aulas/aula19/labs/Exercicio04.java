package com.loiane.cursojava.aulas.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[16];
        double[] B = new double[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor inteiro");
            A[i] = scan.nextInt();
            B[i] = Math.sqrt(A[i]);
        }

        DecimalFormat df = new DecimalFormat("###,###.###");

        for (int i = 0; i < B.length; i++) {
            System.out.println("Valor do indice " + (i+1) + " do vetor B é = " + df.format(B[i]));
        }




    }
}
