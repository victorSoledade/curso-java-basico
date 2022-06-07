package com.loiane.cursojava.aulas.aula24.labs;

public class Exercicio06 {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.nome = "Débora";
        contato.email = "debdoidinha@chave.cria";
        contato.endereco = "Rua: QUEBRADA Casa: 777";
        contato.telefones = new String[2];
        contato.telefones[0] = "6666 6666";
        contato.telefones[1] = "7777 7777";


        System.out.println(contato.nome);
        System.out.println(contato.endereco);
        System.out.println(contato.email);
        System.out.println(contato.telefones[0]);
        System.out.println(contato.telefones[1]);

    }
}
