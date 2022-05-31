package com.loiane.cursojava.aulas.aula19.labs;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int countIgualQuinze = 0;
        int somaMenorQuinze = 0;
        int somaMaiorQuinze = 0;
        double mediaMaiorQuinze = 0;
        int countMaiorQuinze = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um valor para o index: " + i);
            A[i] = scan.nextInt();
            if (A[i] < 15) {
                somaMenorQuinze += A[i];
            } else if (A[i] == 15) {
                countIgualQuinze++;
            } else if (A[i] > 15) {
                somaMaiorQuinze += A[i];
                countMaiorQuinze++;
            }
        }

        for (int i = 0; i < A.length; i++) {
            mediaMaiorQuinze = (double)somaMaiorQuinze / countMaiorQuinze;
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("a) Soma dos menores que 15: " + somaMenorQuinze);

        System.out.println("b) Quantidade dos iguais a 15: " + countIgualQuinze);

        System.out.println("c) Media dos maiores que 15: " + mediaMaiorQuinze);

    }
}
