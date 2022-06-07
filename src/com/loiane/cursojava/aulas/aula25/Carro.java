package com.loiane.cursojava.aulas.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void autonomiaCarro() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

}


