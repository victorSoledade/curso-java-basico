package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        double populacaoA = 80000;
        double populacaoB = 200000;
        int cont = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA/100) * 3;
            populacaoB += (populacaoB/100) * 1.5;
            cont++;
        }
        System.out.println("População A:" + populacaoA);
        System.out.println("População B:" + populacaoB);
        System.out.println("Anos: "+cont);



    }
}
