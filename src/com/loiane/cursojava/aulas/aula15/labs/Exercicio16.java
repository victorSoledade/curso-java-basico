package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os valores de a, b e c para fazer um cálculo de equação do segundo grau\n============");

        int a = scan.nextInt();

        if(a == 0) {
            System.out.println("Essa equação não é do segundo grau!");
            return;
        }

        int b = scan.nextInt();
        int c = scan.nextInt();

        double delta = (b * b) - 4 * a * c;

        System.out.println("Delta: " + delta);

        if(delta < 0) {
            System.out.println("Esse valor de delta: "+delta+" não tem raízes.");
        } else {
            double raiz1 = ((-b) + Math.sqrt(delta)) / (2*a);
            double raiz2 = ((-b) - Math.sqrt(delta)) / (2*a);

            System.out.println("x1 = "+raiz1);
            System.out.println("x2 = "+raiz2);
        }

    }
}
