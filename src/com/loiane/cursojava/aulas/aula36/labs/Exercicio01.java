package com.loiane.cursojava.aulas.aula36.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome para a agenda");
        String nome = scan.next();

        Agenda agenda = new Agenda();

        agenda.setNome(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informacoes do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome");
            nome = scan.next();
            c.setNome(nome);

            System.out.println("Entre com o telefone");
            String telefone = scan.next();
            c.setTelefone(telefone);

            System.out.println("Entre com o email");
            String email = scan.next();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }


    }
}
