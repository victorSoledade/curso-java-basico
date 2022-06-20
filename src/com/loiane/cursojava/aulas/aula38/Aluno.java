package com.loiane.cursojava.aulas.aula38;

public class Aluno extends Pessoa {


    private double[] notas;
    private String curso;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, double[] notas, String curso) {
        super(nome, endereco, telefone);
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

    public void metodoQualquer () {
        this.setCpf("zapzap3"); //super.setCpf("zapzap3");
    }


}
