package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();


        for (int i = num1; i<= num2; i++) {
            System.out.println(i);
        }

    }
}
