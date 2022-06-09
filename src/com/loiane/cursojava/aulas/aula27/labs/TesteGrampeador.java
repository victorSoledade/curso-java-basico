package com.loiane.cursojava.aulas.aula27.labs;

import java.util.Scanner;

public class TesteGrampeador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Grampeador grampeador = new Grampeador();

        System.out.println("Digite a cor do grampeador");
        grampeador.cor = scan.next();

        System.out.println("Digite a potencia do grampeador");
        grampeador.potencia = scan.nextInt();

        System.out.println("Digite se o grampeador está carregado");
        grampeador.carregado = scan.nextBoolean();

        grampeador.status();
        grampeador.grampear();




    }
}
