package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numeros = new double[5];
        double maiorNumero = 0;

        System.out.println("Digite 5  números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scan.nextDouble();
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        System.out.println("maior: "+ maiorNumero);

        System.out.println("\nOutra forma\n");

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O maior agora é:" + maior);
            }
        }
        System.out.println("O maior número foi: " + maior);

    }
}
