package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com a base e a potencia");
        int base = scan.nextInt();
        int pot = scan.nextInt();

        int resultado = base;

        for (int i = 1; i < pot; i++) {
            resultado *= base;
        }

        System.out.println(resultado);

    }
}
