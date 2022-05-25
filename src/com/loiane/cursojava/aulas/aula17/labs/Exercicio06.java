package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println("Vertical");
        for (int i=0;i<20;i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Horizontal");
        for (int i=0;i<20;i++) {
            System.out.print(numeros[i]+" ");
        }

        // ou

        for (int i = 0; i<20;i++) {
            System.out.println(i);
        }

        for (int i = 0; i<20;i++) {
            System.out.print(i + " ");
        }

    }
}
