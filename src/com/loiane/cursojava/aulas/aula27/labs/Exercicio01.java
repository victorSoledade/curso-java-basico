package com.loiane.cursojava.aulas.aula27.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lampada lampada = new Lampada();

        lampada.marca = "Lorenzeti";
        lampada.cor = "Branca";
        lampada.tipo = "Bivolt";

        System.out.println("Digite '1' para ligar a lampada");
        int valor = scan.nextInt();

        lampada.estadoLampada(valor);


    }
}
