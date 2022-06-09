package com.loiane.cursojava.aulas.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }


    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Contrutor com 3 parametros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo,10);
        System.out.println("Construtor com 2 parametros");
    }

    void autonomiaCarro() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
    }

    public double obterAutonomia() {
        System.out.println("Método obter autonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km) {
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }

}
