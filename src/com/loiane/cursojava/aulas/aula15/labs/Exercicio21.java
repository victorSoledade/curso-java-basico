package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de litros vendidos e o tipo do combustível, A-alcool G-gasolina");

        System.out.println("Quantos litros você quer?");
        double litrosDeCombustivel = scan.nextDouble();
        System.out.println("Qual tipo de combustível? A-alcool G-gasolina");
        String tipoDoCombustivel = scan.next();

        double precoAPagar = 0;

        if (litrosDeCombustivel <= 20 && tipoDoCombustivel.equalsIgnoreCase("A")) {
            precoAPagar = litrosDeCombustivel * 1.90 - litrosDeCombustivel * 0.03;
            System.out.println("O valor do seu combustivel ficou: "+precoAPagar);
        } else if (litrosDeCombustivel > 20 && tipoDoCombustivel.equalsIgnoreCase("A")) {
            precoAPagar = litrosDeCombustivel * 1.90  - litrosDeCombustivel * 0.05;
            System.out.println("O valor do seu combustivel ficou: "+precoAPagar);
        } else if (litrosDeCombustivel <= 20 && tipoDoCombustivel.equalsIgnoreCase("G")) {
            precoAPagar = litrosDeCombustivel * 2.50 - litrosDeCombustivel * 0.04;
            System.out.println("O valor do seu combustivel ficou: "+precoAPagar);
        } else if (litrosDeCombustivel > 20 && tipoDoCombustivel.equalsIgnoreCase("G")) {
            precoAPagar = litrosDeCombustivel * 2.50 - litrosDeCombustivel * 0.06;
            System.out.println("O valor do seu combustivel ficou: "+precoAPagar);
        }

    }
}
