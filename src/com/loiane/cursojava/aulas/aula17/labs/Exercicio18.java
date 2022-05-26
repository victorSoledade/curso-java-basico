package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um numero para saber se e primo");
        int numero  = scan.nextInt();
        
        boolean valido = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                valido = false;
                System.out.println("Não é primo - divisivel por: " + i);
            }
        }
        if (valido) {
            System.out.println("É primo");
        }



    }
}
