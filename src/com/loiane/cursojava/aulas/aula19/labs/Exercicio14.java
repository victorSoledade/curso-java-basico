package com.loiane.cursojava.aulas.aula19.labs;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] imparesA = new int[A.length];
        int soma = 0;
        int countImpar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor para o index " + i);
            A[i] = scan.nextInt();
            if (A[i] % 2 != 0) {
                imparesA[i] = A[i];
                soma += imparesA[i];
                countImpar++;
            }
        }

        int media = soma / countImpar;

        System.out.println("A media dos valores impares é: " + media);
        System.out.println("Quantidade de impares: " + countImpar);


        // outra forma, com um array apenas

        int[] vetorA = new int[10];
        int mediaA = 0;
        int somaA = 0;
        int impares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite um valor");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 != 0) {
                somaA += vetorA[i];
                impares++;
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.println("A soma dos valores é: " + somaA);
        System.out.println("A média é: " + somaA / impares);



    }
}
