package com.loiane.cursojava.aulas.aula27.labs;

public class Grampeador {

    String cor;
    int potencia;
    boolean carregado;

    void status() {
        System.out.println("A cor do grampeador é: " + this.cor);
        System.out.println("A potencia do grampeador é: " + this.potencia);
        System.out.println("O grampeador está carregado? " + this.carregado);
    }

    void grampear() {
        if (carregado) {
            System.out.println("Estou grampeando");
        } else {
            System.out.println("Não posso grampear, carregue o grampeador");
        }
    }

}
