package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma entre "+num1+" e "+num2+" é: "+soma);
    }
}
