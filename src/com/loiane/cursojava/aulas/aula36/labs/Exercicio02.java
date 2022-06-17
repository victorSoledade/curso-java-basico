package com.loiane.cursojava.aulas.aula36.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nome = scan.next();

        System.out.println("Digite o horário");
        String horario = scan.next();

        System.out.println("Digite o nome do professor");
        String nomeProfessor = scan.next();

        System.out.println("Digite o departamento do professor");
        String depProfessor = scan.next();

        System.out.println("Digite o email do professor");
        String emailProfessor = scan.next();

        Curso curso = new Curso();

        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();

        professor.setNome(nomeProfessor);
        professor.setDepartamento(depProfessor);
        professor.setEmail(emailProfessor);

        curso.setProfessor(professor);

        System.out.println("======Alunos======");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com o nome do aluno " + (i+1));
            String nomeAluno = scan.next();

            System.out.println("Entre com a matrícula do aluno " + (i+1));
            String matAluno = scan.next();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());




    }
}
