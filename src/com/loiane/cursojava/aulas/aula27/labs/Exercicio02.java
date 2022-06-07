package com.loiane.cursojava.aulas.aula27.labs;

public class Exercicio02 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = "126456";
        contaCorrente.agencia = "123";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.saldo = -10;
        contaCorrente.valorEspecialUsado = 0;

        System.out.println("Saldo da conta: " + contaCorrente.numero + " = " + contaCorrente.saldo);

        boolean saqueEfetuado = contaCorrente.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("saqueEfetuado com sucesso");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque, saldo insuficiente");
        }

        saqueEfetuado = contaCorrente.realizarSaque(500);

        System.out.println("tentativa de saque de 500 conto");
        if (saqueEfetuado) {
            System.out.println("saqueEfetuado com sucesso");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque, saldo insuficiente");
        }
        System.out.println("Deposito de R$500");
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        contaCorrente.consultarSaldo();
        contaCorrente.realizarSaque(600);

        if (contaCorrente.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

    }
}
