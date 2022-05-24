package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Descubra se esse ano é bissexto");

        double ano = scan.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("Esse ano é bissexto");
        } else {
            System.out.println("Esse ano não é bissexto");
        }
    }
}
