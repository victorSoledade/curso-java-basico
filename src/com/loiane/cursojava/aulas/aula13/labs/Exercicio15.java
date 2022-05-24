package com.loiane.cursojava.aulas.aula13.labs;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculador de tempo de download\n---------------");

        System.out.println("Digite o tamanho do seu arquivo em MB: ");
        double tamanhoArquivoMB = scan.nextDouble();
        System.out.println("Velocidade da sua internet: ");
        double velocidadeInternet = scan.nextDouble();

        double tempoDownload = tamanhoArquivoMB / velocidadeInternet;
        System.out.println("Seu download demorará: "+tempoDownload);

    }
}
