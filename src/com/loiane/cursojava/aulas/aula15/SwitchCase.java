package com.loiane.cursojava.aulas.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite valores entre 1 e 7 para saber o dia da semana");

        int dia = scan.nextInt();


//        switch (dia) {
//            case 6:
//            case 5:
//            case 4:
//            case 3:
//            case 2:
//                System.out.println("É dia da semana");
//                break;
//            case 1:
//            case 7:
//                System.out.println("Não, é fim de semana");
//                break;
//            default:
//                System.out.println("Digite um numero entre 1 e 7");
//                break;
//        }

        // forma mais intuitiva


        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunoda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Digite um valor válido, entre 1 e 7");
                break;
        }

    }
}
