package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];
        int menorIdade = 999;
        int indexMenor = 0;
        int maiorIdade = 0;
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++) {
            System.out.println("Digite um valor para o index " + i);
            idades[i] = scan.nextInt();
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                indexMaior = i;
            } else if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                indexMenor = i;
            }
        }

        System.out.println("Vetor A = ");
        for (int i = 1; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade = " + menorIdade);
        System.out.println("Index menor idade = " + indexMenor);
        System.out.println("Maior idade = " + maiorIdade);
        System.out.println("Index maior idade = " + indexMaior);


    }
}
