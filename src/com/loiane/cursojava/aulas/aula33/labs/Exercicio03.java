package com.loiane.cursojava.aulas.aula33.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome: ");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());

        System.out.println("Digite sua matricula");
        aluno.setMatricula(scan.next());

        for(int i = 0;i<aluno.getNomeDisciplinas().length;i++){
            System.out.println("Digite o nome da disciplina");
            aluno.setNomeDisciplina(i,scan.next());
        }

        for(int i = 0;i<aluno.getNotasDisciplinas().length;i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Digite a nota " + (j + 1));
                aluno.setNotaPosIJ(i, j, scan.nextDouble() );
            }
        }

        aluno.mostrarInfo();

        for(int i = 0;i<aluno.getNomeDisciplinas().length;i++){
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina -" + aluno.getNomeDisciplinas()[i] + " foi aprovado");
            } else {
                System.out.println("Disciplina -" + aluno.getNomeDisciplinas()[i] + " foi reprovado");
            }
        }
    }

}
