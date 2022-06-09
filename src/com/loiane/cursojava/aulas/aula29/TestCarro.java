package com.loiane.cursojava.aulas.aula29;

public class TestCarro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    TestCarro() {
        System.out.println("Esse metodo foi instanciado");
        this.numPassageiros = 4;
    }

    TestCarro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }


    void autonomiaCarro() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    double obterAutonomia() {
        System.out.println("Método obter autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km/consumoCombustivel;
    }

}
