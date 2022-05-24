package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite M para masculino e F para feminino");

        String sexo = scan.next();

        switch (sexo) {
            case "M":
                System.out.println("Você é do sexo masculino");
                break;
            case "m":
                System.out.println("Você é do sexo masculino");
                break;
            case "F":
                System.out.println("Você é do sexo feminino");
                break;
            case "f":
                System.out.println("Você é do sexo feminino");
                break;
            default:
                System.out.println("Ocorreu um erro. Digite M para masculino e F para feminino");
                break;
        }
    }
}
