package com.loiane.cursojava.aulas.aula27.labs;

public class Lampada {

    String marca;
    String cor;
    String tipo;

    void estadoLampada(int valor) {
        if (valor == 1) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }
    }


}
