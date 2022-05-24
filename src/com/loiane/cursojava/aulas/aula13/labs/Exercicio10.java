package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Loucuras\n-----------------");
        System.out.println("Digite dois números inteiros e um real: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();

        int calculoDobroPrimeiroMetadeSegundo = (numero1*2) * (numero2/2);
        System.out.println("Produto do dobro do primeiro com a metade do segundo: "+calculoDobroPrimeiroMetadeSegundo);

        double calculoSomaTriploPrimeiroComTerceiro = numero1 * 3 + numero3;
        System.out.println("Calculo da soma do tiplo do primeiro com o terceiro: "+calculoSomaTriploPrimeiroComTerceiro);

        double calculoDoCuboDoTerceiro = numero3 * numero3 * numero3;
        System.out.println("Calculo do cubo do terceiro número: "+calculoDoCuboDoTerceiro);

    }
}
