package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os lados do triangulo para saber se é equilátero, isóceles ou escaleno");

        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();


        if (lado1 + lado2 > lado3 || lado3 + lado1 > lado2 || lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Isso é um triângulo Equilátero");
            } else if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3) {
                System.out.println("Isso é um triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isso é um triângulo Isóceles");
            }
        } else {
            System.out.println("Isso não é um triângulo.");
        }
    }
}
