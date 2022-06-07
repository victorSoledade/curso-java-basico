package com.loiane.cursojava.aulas.aula24.labs;

import java.util.Date;

public class Exercicio04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro01 = new LivroDeBiblioteca();

        livro01.emprestado = true;
        livro01.dataEntrega = new Date();
        livro01.emprestadoA = "Victor";

        System.out.println(livro01.emprestado);
        System.out.println(livro01.dataEntrega);
        System.out.println(livro01.emprestadoA);

    }
}
