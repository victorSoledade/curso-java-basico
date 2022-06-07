package com.loiane.cursojava.aulas.aula27.labs;

public class Exercicio01b {
    public static void main(String[] args) {
        Lampadab lampada = new Lampadab();

        lampada.marca = "Lorenzeti";
        lampada.cor = "Branca";
        lampada.tipo = "Bivolt";

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();



    }
}
