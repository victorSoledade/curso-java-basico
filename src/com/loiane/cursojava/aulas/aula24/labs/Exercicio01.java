package com.loiane.cursojava.aulas.aula24.labs;

public class Exercicio01 {
    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();

        lampada1.tipos = new String[5];

        lampada1.marca = "Lorenzzetti";
        lampada1.cor = "Branca";
        lampada1.frequencia = 60;
        lampada1.potencia = 18;
        lampada1.tecnologia = "LED";
        lampada1.voltagem = "Bivolt";
        lampada1.tipos[0] = "Abajur";
        lampada1.tipos[1] = "Luminária";

        System.out.println("Marca: "+lampada1.marca);
        System.out.println("Cor: "+lampada1.cor);
        System.out.println("Frequência: "+lampada1.frequencia);
        System.out.println("Potência: "+lampada1.potencia);
        System.out.println("Tecnologia: "+lampada1.tecnologia);
        System.out.println("Bivolt: "+lampada1.voltagem);
        System.out.println("Tipos: "+lampada1.tipos[0]);
        System.out.println("Tipos: "+lampada1.tipos[1]);




    }
}
