package com.loiane.cursojava.aulas.aula36.labs;

public class TesteOculos {
    public static void main(String[] args) {
        Oculos oculos = new Oculos();

        oculos.setTipo("De grau");
        System.out.println(oculos.getTipo());

        //

        Grau grau = new Grau();

        grau.setGraus("1.25");
        grau.setTipo("Para longe");

        oculos.setGrau(grau);

        if (oculos != null && oculos.getGrau() != null) {
            System.out.println(oculos.getGrau().getTipo());
            System.out.println(oculos.getGrau().getGraus());
        }



    }
}
