package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber se é positivo ou negativo");

        double numero = scan.nextDouble();


        if (numero == 0) {
            System.out.println("0 não é um número válido");
        }
        else if (numero < 0) {
            System.out.println("Esse valor é negativo");
        } else {
            System.out.println("Esse valor é positivo");
        }

    }
}
