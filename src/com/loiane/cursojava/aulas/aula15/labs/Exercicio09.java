package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números e vou imprimí-los em ordem decrescente");

        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double numero3 = scan.nextDouble();

        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println("" + numero1 + " " + numero2 + " " + numero3);
        } else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println("" + numero2 + " " + numero1 + " " + numero3);
        } else {
            System.out.println("" + numero3 + " " + numero2 + " " + numero1);
        }

    }
}
