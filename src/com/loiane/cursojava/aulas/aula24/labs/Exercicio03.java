package com.loiane.cursojava.aulas.aula24.labs;

public class Exercicio03 {
    public static void main(String[] args) {
        LivroLivraria livro01 = new LivroLivraria();

        livro01.nome = "As cronicas de Nárnia";
        livro01.Autor = "C. S. Lewis";
        livro01.numeroDePaginas = 530;
        livro01.idioma = "Pt-Br";
        livro01.preco = 120.50;

        System.out.println(livro01.nome);
        System.out.println(livro01.Autor);
        System.out.println(livro01.numeroDePaginas);
        System.out.println(livro01.idioma);
        System.out.println(livro01.preco);


    }
}
