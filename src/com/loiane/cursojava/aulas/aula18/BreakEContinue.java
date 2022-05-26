package com.loiane.cursojava.aulas.aula18;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int numero = scan.nextInt();
        System.out.println("Entre com um limite");
        int limite = scan.nextInt();

        /*for (int i = numero; i <= limite; i++) {
            if (i % 7 == 0) {
                System.out.println("O valor de i: " + i);
                break;
            }
        }*/

        for (int i = numero; i < limite; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

    }
}
