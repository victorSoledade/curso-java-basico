package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.length() < 3) {
                infoValida = false;
                System.out.println("Digite um nome com mais de 3 caracteres");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        do {
            System.out.println("Idade: ");
            idade = scan.nextInt();
            if (idade < 0 || idade > 150) {
                infoValida = false;
                System.out.println("Digite uma idade válida");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        do {
            System.out.println("Salario");
            salario = scan.nextDouble();
            if (salario <= 0) {
                infoValida = false;
                System.out.println("Digite um valor válido");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        do {
            System.out.println("sexo: ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                infoValida = true;
            } else {
                infoValida = false;
                System.out.println("Você tem que escolher entre m e f");

            }
        } while (!infoValida);

        do {
            System.out.println("Estado civil: ");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                infoValida = false;
            }
        } while (!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

    }
}
