package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor em graus Farenheit: ");
        double grausFarenheit = scan.nextDouble();
        double calculaGrausCelsius = (5 * (grausFarenheit - 32 ) / 9);
        System.out.println(grausFarenheit+" Em celsius é: "+calculaGrausCelsius);

    }
}
