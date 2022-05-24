package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char conceito = ' ';

        System.out.println("Digite duas notas: ");

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            conceito = 'S';
        } else if (media >= 9 && media <= 10) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
        } else if (media >= 0 && media < 4) {
            conceito = 'E';
        }

        System.out.println("Sua nota1: " + nota1);
        System.out.println("Sua nota2: " + nota2);
        System.out.println("Seu conceito: " + conceito);
        System.out.println("Sua media: " + media);

        switch (conceito) {
            case 'S':
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Você está aprovado");
                break;
            case 'D':
            case 'E':
                System.out.println("Você está reprovado");
                break;
            default:
                System.out.println("Ocorreu algum erro!");
                break;

        }
    }
}
