package com.loiane.cursojava.aulas.aula27.labs;

import java.util.Scanner;

public class TesteCaneta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Caneta caneta = new Caneta();

        System.out.println("Digite o modelo da caneta");
        caneta.modelo = scan.next();

        System.out.println("Digite a cor da caneta");
        caneta.cor = scan.next();

        System.out.println("Digite a ponta da caneta");
        caneta.ponta = scan.nextFloat();

        System.out.println("Digite a carga da caneta");
        caneta.carga = scan.nextInt();

        System.out.println("Digite se está tampada a caneta (true or false)");
        caneta.tampada = scan.nextBoolean();

        caneta.status();

        caneta.destampar();

        caneta.rabiscar();

        caneta.tampar();

        caneta.rabiscar();

        Caneta caneta1 = new Caneta();

        System.out.println("Digite o modelo da caneta");
        caneta1.modelo = scan.next();

        System.out.println("Digite a cor da caneta");
        caneta1.cor = scan.next();

        System.out.println("Digite a ponta da caneta");
        caneta1.ponta = scan.nextFloat();

        System.out.println("Digite a carga da caneta");
        caneta1.carga = scan.nextInt();

        System.out.println("Digite se está tampada a caneta (true or false)");
        caneta1.tampada = scan.nextBoolean();

        caneta1.status();

        caneta1.tampar();

        caneta1.rabiscar();

        caneta1.destampar();

        caneta1.rabiscar();





    }
}
