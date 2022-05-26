package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];
        int quantidadePar = 0;
        int quantidadeImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número");
            numeros[i] = scan.nextInt();
            if (numeros[i] % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }
        }

        System.out.println("Quantidade par: "+quantidadePar);
        System.out.println("Quantidade impar: "+quantidadeImpar);

        // outra forma

        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um num");
            num = scan.nextInt();

            if(num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("IMPares: " + impares);



    }
}
