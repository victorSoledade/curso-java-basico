package com.loiane.cursojava.aulas.aula17;

public class LoopFor {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("I tem valor: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("I = " + i + "; j = " + j);// for com duas variaveis
        }

        int count = 0;
        for (; count < 5; ) {
            System.out.println("valor de count: " + count);
            count += 2;
        }

        // ==

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("valor de cont: " + cont);
        }

//        for (;;) {
//            System.out.println("Eu sou o caçador!"); for infinitom dangerous!
//        }

        int soma = 0;

        for (int i=1; i < 5; soma += i++) {
            System.out.println("valor da soma é: " + soma);
        }

    }
}
