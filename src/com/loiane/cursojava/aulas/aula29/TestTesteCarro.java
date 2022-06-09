package com.loiane.cursojava.aulas.aula29;

public class TestTesteCarro {
    public static void main(String[] args) {

        TestCarro van = new TestCarro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros); // 4

        TestCarro testCarro = new TestCarro("Fiat","Ducato", 5);
        System.out.println(testCarro.marca);
        System.out.println(testCarro.modelo);
        System.out.println(testCarro.numPassageiros);



    }
}
