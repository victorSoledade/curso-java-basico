package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = 0;


        for (int i = num1; i<= num2; i++) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("soma > "+ soma);
    }
}
