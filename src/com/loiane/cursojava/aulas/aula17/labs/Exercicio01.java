package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Digite uma nota entre 0 e 10");
//        int nota = scan.nextInt();
//
//        if (nota >= 0 && nota <= 10) {
//            System.out.println("Você digitou = " + nota);
//            return;
//        }
//
//        while ( nota <= 0 || nota >= 10) {
//            if (nota <= 0 || nota >= 10){
//                System.out.println("Ocorreu um erro");
//                System.out.println("Digite uma nota entre 0 e 10");
//                nota = scan.nextInt();
//            }
//        } Resultado que eu consegui sozinho, mas existem erros

        // outra forma bem melhor

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                notaValida = false;
                System.out.println("Nota inválida, digite novamente");
            }
        }while (!notaValida); // ou notaValida == false; ou, apenas notaValida

    }
}
