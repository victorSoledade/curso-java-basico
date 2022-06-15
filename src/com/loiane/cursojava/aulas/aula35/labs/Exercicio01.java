package com.loiane.cursojava.aulas.aula35.labs;

public class Exercicio01 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(Calculadora.fibonacci(i) + " ");
        }

        System.out.println(Calculadora.fibonacci(3));

    }
}
