package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numeros = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros[i] = scan.nextDouble();
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println("A soma é: "+ soma);
        System.out.println("A media é: "+ media);

        // outra forma


        double num;
        double somaB=0, mediaB;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            num = scan.nextDouble();
            somaB += num;
        }
        mediaB = somaB / 5;
        System.out.println("A soma é: "+ somaB);
        System.out.println("A media é: "+ mediaB);

    }
}
