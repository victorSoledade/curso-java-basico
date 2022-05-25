package com.loiane.cursojava.aulas.aula17.labs;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean loginValido = false;
        String usuario;
        String senha;

        do {
            System.out.println("Digite usuário e senha");
            usuario = scan.next();
            senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)) {
                loginValido = false;
                System.out.println("Ocorrreu um erro, digite novamente");
            } else {
                loginValido = true;
                System.out.println("Conta criada, user: "+usuario+" senha: "+senha);
            }
        } while (!loginValido);
    }
}
