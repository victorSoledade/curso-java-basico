package com.loiane.cursojava.aulas.aula34.labs;

public class Exercicio02 {

    static void imprimirTela(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(5,5));

        imprimirTela(Calculadora.subtrair(5,5));

        imprimirTela(Calculadora.dividir(5,5));

        imprimirTela(Calculadora.multiplicar(5,5));

       imprimirTela((int) Calculadora.potencia(5,2));


    }

}
