package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index " + i);
            A[i] = scan.nextInt();
        }

        String mensagem;
        boolean primo;

        for (int i = 0; i < A.length; i++) {
            primo = true;

            for (int j = 2; j < A[i]; j++) {
                if (A[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            mensagem = " ";
            if (primo) {
                mensagem = "primo";
            } else {
                mensagem = "não é primo";
            }
            System.out.println(A[i] + " " +mensagem);

        }



    }
}
