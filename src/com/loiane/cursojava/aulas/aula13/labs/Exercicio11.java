package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculando seu peso ideal\n ---------------");

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double calculoPesoIdeal = (72.9 * altura) - 58;

        System.out.println("Com altura de "+altura+"m seu peso ideal seria: " + calculoPesoIdeal+"Kg");

    }
}
