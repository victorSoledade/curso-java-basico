package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que quer converter: ");
        double valorMetro = scan.nextDouble();

        double valorCentimetro = valorMetro * 100;

        System.out.println("Esse valor em centimetro é: " + valorCentimetro+"cm");
    }
}
