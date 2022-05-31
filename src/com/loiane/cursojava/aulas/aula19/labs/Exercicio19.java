package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] result = new double[notas2.length];
        String[] situacao = new String[result.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Digite as nota do primeiro bimestre");
            notas1[i] = scan.nextDouble();
            System.out.println("Digite as nota do segundo bimestre");
            notas2[i] = scan.nextDouble();
        }

        System.out.println("Resultado: ");

        for (int i = 0; i < result.length; i++) {
            result[i] = (notas1[i] + notas2[i]) / 2;
            if (result[i] >= 7) {
                situacao[i] = "Aprovado";
            } else if (result[i] < 7){
                situacao[i] = "Reprovado";
            }
        }

        System.out.println("Notas do primeiro bimestre = ");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }
        System.out.println();

        System.out.println("Notas do segundo bimestre = ");
        for (int i = 0; i < notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }
        System.out.println();

        System.out.println("Média = ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        System.out.println("Situação = ");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Aluno: " + i + " " + situacao[i]);
        }
    }
}
