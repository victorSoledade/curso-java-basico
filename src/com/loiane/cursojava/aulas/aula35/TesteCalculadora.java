package com.loiane.cursojava.aulas.aula35;

public class TesteCalculadora {
    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRescursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorial(5);
        System.out.println(fatorialR);


    }
}
