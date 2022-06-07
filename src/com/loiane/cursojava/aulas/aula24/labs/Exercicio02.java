package com.loiane.cursojava.aulas.aula24.labs;

public class Exercicio02 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.nome = "Histórias Extraordinárias";
        livro1.Autor = "Edgar Alan Poe";
        livro1.idioma = "Potugês - Brasil";
        livro1.anoDaEdicao = 2018;
        livro1.marca = "Pandorga";
        livro1.numeroDePaginas = 385;
        livro1.formatoDigital = false;
        livro1.paisOrigem = "Brasil";

        String formatoMensagem = "Físico";

        System.out.println(livro1.nome);
        System.out.println(livro1.Autor);
        System.out.println(livro1.idioma);
        System.out.println(livro1.anoDaEdicao);
        System.out.println(livro1.marca);
        System.out.println(livro1.numeroDePaginas);
        System.out.println(livro1.formatoDigital + " " + formatoMensagem);
        System.out.println(livro1.paisOrigem);



    }
}
