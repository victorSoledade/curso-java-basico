package com.loiane.cursojava.aulas.aula17.labs;

public class Exercicio09 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,48,46,47,48,49,50};

        for (int i = 0; i < 50; i++) {
            if(numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        // outra forma
        System.out.println("another form");

        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }



    }
}
