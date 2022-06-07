package com.loiane.cursojava.aulas.aula25;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();


        carro1.marca = "Ferrari";
        carro1.modelo = "Mustang";
        carro1.numPassageiros = 2;
        carro1.capCombustivel = 100;
        carro1.consumoCombustivel = 0.9;

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.numPassageiros);
        System.out.println(carro1.capCombustivel);
        System.out.println(carro1.consumoCombustivel);
        System.out.println();

        carro1.autonomiaCarro();
    }
}
