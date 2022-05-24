package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double calculaPesoIdeal = 0;

        System.out.println("Calculando seu peso ideal baseado no seu sexo\n--------------------------");
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite m para masculino e f para feminino: ");
        String sexo = scan.next();

        switch (sexo) {
            case "m":
                calculaPesoIdeal = (72.9 * altura) - 58;
                System.out.println("Seu peso ideal seria: "+ calculaPesoIdeal);
                System.out.println("Digite seu peso: ");
                double peso = scan.nextDouble();
                if(peso < calculaPesoIdeal) {
                    System.out.println("Você está abaixo do peso ideal.");
                } else if (peso == calculaPesoIdeal) {
                    System.out.println("Você está com o peso ideal.");
                } else {
                    System.out.println("Você está acima do peso.");
                }
                break;

            case "M":
                calculaPesoIdeal = (72.9 * altura) - 58;
                System.out.println("Seu peso ideal seria: "+ calculaPesoIdeal);
                System.out.println("Digite seu peso: ");
                peso = scan.nextDouble();
                if(peso < calculaPesoIdeal) {
                    System.out.println("Você está abaixo do peso ideal.");
                } else if (peso == calculaPesoIdeal) {
                    System.out.println("Você está com o peso ideal.");
                } else {
                    System.out.println("Você está acima do peso.");
                }
                break;
            case "f":
                calculaPesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal seria: "+ calculaPesoIdeal);
                System.out.println("Digite seu peso: ");
                peso = scan.nextDouble();
                if(peso < calculaPesoIdeal) {
                    System.out.println("Você está abaixo do peso ideal.");
                } else if (peso == calculaPesoIdeal) {
                    System.out.println("Você está com o peso ideal.");
                } else {
                    System.out.println("Você está acima do peso.");
                }
                break;
            case "F":
                calculaPesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal seria: "+ calculaPesoIdeal);
                System.out.println("Digite seu peso: ");
                peso = scan.nextDouble();
                if(peso < calculaPesoIdeal) {
                    System.out.println("Você está abaixo do peso ideal.");
                } else if (peso == calculaPesoIdeal) {
                    System.out.println("Você está com o peso ideal.");
                } else {
                    System.out.println("Você está acima do peso.");
                }
                break;
            default:
                System.out.println("Digite um valor de sexo, m para masculino, f para feminino.");
                System.out.println("Digite seu peso: ");
                peso = scan.nextDouble();
                if(peso < calculaPesoIdeal) {
                    System.out.println("Você está abaixo do peso ideal.");
                } else if (peso == calculaPesoIdeal) {
                    System.out.println("Você está com o peso ideal.");
                } else {
                    System.out.println("Você está acima do peso.");
                }
                break;
        }

    }
}
