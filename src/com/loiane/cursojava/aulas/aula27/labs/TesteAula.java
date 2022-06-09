package com.loiane.cursojava.aulas.aula27.labs;

public class TesteAula {
    public static void main(String[] args) {
        Aula aula = new Aula();

        aula.materia = "JavaOO";
        aula.professor = "Guanabara";
        aula.duracao = 20.21;
        aula.quantidadePercorrida = "Comecando";

        aula.status();

        aula.continuarAula();

    }
}
