package com.loiane.cursojava.aulas.aula24.labs;

public class Exercicio05 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = 126456;
        contaCorrente.saldo = 50000;
        contaCorrente.especial = false;
        contaCorrente.limite = 1200;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.limite);
        System.out.println(contaCorrente.especial);
    }
}
