package com.loiane.cursojava.aulas.aula27.labs;

public class Lampadab {

    String marca;
    String cor;
    String tipo;

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

}


