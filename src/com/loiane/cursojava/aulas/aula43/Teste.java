package com.loiane.cursojava.aulas.aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("ADS");
        double[] notas = {10,9,8,7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "da8wss8s";
        String s2 = "da8wss8s";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("ADS");
        double[] notas2 = {10,9,8,7};
        aluno2.setNotas(notas);

        System.out.println(aluno.equals(aluno2));


    }

}
