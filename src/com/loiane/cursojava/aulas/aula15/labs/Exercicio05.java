package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as duas notas (de 0 a 10) do aluno para saber se ele passou. Caso a média dele seja maior que 7");

        double nota1 = scan.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Digite uma nota válida!");
            return;
        }
        double nota2 = scan.nextDouble();
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Digite uma nota válida!");
            return;
        }

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Este aluno passou com Distinção");
        } else if (media >= 7){
            System.out.println("Este aluno passou!");
        } else {
            System.out.println("Este aluno foi reprovado!");
        }
    }
}
