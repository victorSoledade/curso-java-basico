package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vou fazer perguntas sobre um crime para você. Você responderá com s para 'sim' e 'n' para não");
        int contador = 0;

        System.out.println("Já telefonou para a vítima? 's' ou 'n' ");
        String resp1 = scan.next();
        System.out.println("Esteve no local do crime? 's' ou 'n'");
        String resp2 = scan.next();
        System.out.println("Mora perto da vitimia? 's' ou 'n'");
        String resp3 = scan.next();
        System.out.println("Devia para a vitima? 's' iu 'n'");
        String resp4 = scan.next();
        System.out.println("Já trabalhou com a vitima? 's' ou 'n'");
        String resp5 = scan.next();

        if (resp1.equalsIgnoreCase("s")){
            contador++;
        }
        if (resp2.equalsIgnoreCase("s")){
            contador++;
        }
        if (resp3.equalsIgnoreCase("s")){
            contador++;
        }
        if (resp4.equalsIgnoreCase("s")){
            contador++;
        }
        if (resp5.equalsIgnoreCase("s")){
            contador++;
        }

        if (contador == 2) {
            System.out.println("Você é suspeito");
        } else if (contador > 2 && contador <=4) {
            System.out.println("Você é cumplice");
        } else if (contador == 5) {
            System.out.println("Você é O ASSASSINO!");
        } else {
            System.out.println("Você é inocente");
        }

    }
}
