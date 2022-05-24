package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tuno que você estuda. M - matutino, V - vespertino e N - noturno");

        String turno = scan.next();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!!!!");
                break;
            case "m":
                System.out.println("Bom dia!!!!");
                break;
            case "V":
                System.out.println("Boa tarde!!!!!");
                break;
            case "v":
                System.out.println("Boa tarde!!!!!");
                break;
            case "N":
                System.out.println("Boa noite!!!!!!!!!!");
                break;
            case "n":
                System.out.println("Boa noite!!!!!!!!!!");
                break;
            default:
                System.out.println("Algo deu errado. Digite M para matutino, V para vespertino e N para noturno.");
                break;
        }

    }
}
