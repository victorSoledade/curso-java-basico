package com.loiane.cursojava.aulas.aula27.labs;

import java.util.Objects;

public class Aula {

    String materia;
    String professor;
    double duracao;
    String quantidadePercorrida;

    void status() {
        System.out.println("Matéria da aula: " + this.materia);
        System.out.println("Professor da aula: " + this.professor);
        System.out.println("Duração da aula: " + this.duracao);
        System.out.println("Quantidade da aula percorrida: " + this.quantidadePercorrida);
    }

    void continuarAula() {
        if (Objects.equals(this.quantidadePercorrida, "Metade")) {
            System.out.println("Continuar aula");
        } else if (Objects.equals(this.quantidadePercorrida, "Quasela")) {
            System.out.println("Continuar aula");
        } else {
            System.out.println("Participar depois");
        }
    }


}
