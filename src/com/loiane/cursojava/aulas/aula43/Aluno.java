package com.loiane.cursojava.aulas.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {


    private double[] notas;
    private String curso;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, double[] notas, String curso) {
       // super(nome, endereco, telefone);
        this.notas = notas;
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    //public void metodoQualquer () {
      //  this.setCpf("zapzap3"); //super.setCpf("zapzap3");
    //}

    public String obterEtiquetaEndereco() {

        String s = "Endereço do aluno: ";
        //s += super.getEndereco();
        return s;

    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("imprimindo endereço do professor");
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString() {
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "notas=" + Arrays.toString(notas) +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Arrays.equals(getNotas(), aluno.getNotas()) && Objects.equals(getCurso(), aluno.getCurso());
    }
}
