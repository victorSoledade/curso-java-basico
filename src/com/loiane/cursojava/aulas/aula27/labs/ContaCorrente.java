package com.loiane.cursojava.aulas.aula27.labs;

public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double valorEspecialUsado;
    double limiteEspecial;


    boolean realizarSaque(double quantiaASacar) {

        // tem saldo
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { // nao tem saldo
            if (especial) { // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else { // nao e especial e nao tem saldo suficiente
                    return false;
                }
            } else {
                return false;
            }
        }

    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

}
