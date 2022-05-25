package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valido = false;

        double populacaoA;
        double populacaoB;
        int cont = 0;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Entre com a populacao A");
            populacaoA = scan.nextDouble();
            if (populacaoA > 0) {
                valido = true;
            } else {
                valido = false;
                System.out.println("A população nao pode ser 0");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a populacao B");
            populacaoB = scan.nextDouble();
            if (populacaoB > 0) {
                valido = true;
            } else {
                valido = false;
                System.out.println("A população nao pode ser 0");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de crescimento populacao A");
            taxaA = scan.nextDouble();
            if (taxaA > 0) {
                valido = true;
            } else {
                valido = false;
                System.out.println("A taxa de cresimento A precisa ser maior q 0");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de crescimento populacao B");
            taxaB = scan.nextDouble();
            if (taxaB > 0) {
                valido = true;
            } else {
                valido = false;
                System.out.println("A taxa de cresimento B precisa ser maior q 0");
            }
        }while (!valido);

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;
            cont++;
        }
        System.out.println("População A:" + populacaoA);
        System.out.println("População B:" + populacaoB);
        System.out.println("Anos: " + cont);
    }
}
