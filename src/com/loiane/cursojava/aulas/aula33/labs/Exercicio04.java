package com.loiane.cursojava.aulas.aula33.labs;


import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador1 = X");
        System.out.println("Jogador2 = O");

        boolean ganhou = false;
        char sinal;
        int linha, coluna;

        while (!ganhou) {
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            jogoDaVelha.validarJogada(linha, coluna, sinal);


            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns jogador 2 ganhou!");
            } else if (jogoDaVelha.getJogada() > 9) {
                ganhou = true;
                System.out.println("EMPATE!, ninguém ganhou.");
            }

        }
    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValido = false;

        while (!valorValido) {
            System.out.println("Entre com o" + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor--;
        return valor;
    }
}

