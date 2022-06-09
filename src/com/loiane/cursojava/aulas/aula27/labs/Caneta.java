package com.loiane.cursojava.aulas.aula27.labs;

public class Caneta {

    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Caneta");
        System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A ponta da caneta é: " + this.ponta);
        System.out.println("A carga da caneta é: " + this.carga);
        System.out.println("A caneta está tampada?: " + this.tampada);
    }

    void rabiscar() {
        if (this.carga >= 40 && !this.tampada) {
            System.out.println("Rabiscandoo!");
        } else {
            System.out.println("Para rabiscar, a carga da caneta deve ser maior ou igual à 40 e estar destampada");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
