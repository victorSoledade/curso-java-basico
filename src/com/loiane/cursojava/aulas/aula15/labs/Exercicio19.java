package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois número e depois, caso queira dividí-los digite D, multiplica-los M, soma-los S e subtrai-los s");

        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();

        System.out.println("Digite: M multiplicar, D Dividir, S somar e s subtrair");

        String operacao = scan.next();

        switch (operacao) {
            case "M":
                double acao = numero1 * numero2;
                System.out.println("Num1 multiplicado por Num2: " + acao);
                if (acao % 2 == 0) {
                    System.out.println("É um número par");
                } else if (acao < 0) {
                    System.out.println("é um valor negativo");
                } else if (acao > 0) {
                    System.out.println("É um valor positivo");
                } else {
                    System.out.println("É um número ímpar");
                }
                break;
            case "D":
                acao = numero1 / numero2;
                System.out.println("Num1 dividido por Num2: " + acao);
                if (acao % 2 == 0) {
                    System.out.println("É um número par");
                } else if (acao < 0) {
                    System.out.println("é um valor negativo");
                } else if (acao > 0) {
                    System.out.println("É um valor positivo");
                } else {
                    System.out.println("É um número ímpar");
                }
                break;
            case "S":
                acao = numero1 + numero2;
                System.out.println("Num1 somado por Num2: " + acao);
                if (acao % 2 == 0) {
                    System.out.println("É um número par");
                } else if (acao < 0) {
                    System.out.println("é um valor negativo");
                } else if (acao > 0) {
                    System.out.println("É um valor positivo");
                } else {
                    System.out.println("É um número ímpar");
                }
                break;
            case "s":
                acao = numero1 - numero2;
                System.out.println("Num1 subtraido por Num2: " + acao);
                if (acao % 2 == 0) {
                    System.out.println("É um número par");
                } else if (acao < 0) {
                    System.out.println("é um valor negativo");
                } else if (acao > 0) {
                    System.out.println("É um valor positivo");
                } else {
                    System.out.println("É um número ímpar");
                }
                break;
            default:
                System.out.println("Ocorreu algum erro");
                break;
        }


    }
}
