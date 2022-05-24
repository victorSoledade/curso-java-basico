package com.loiane.cursojava.aulas.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço de três produtos e te direi qual comprar, quanto mais barato melhor :D ");

        double produto1 = scan.nextDouble();
        double produto2 = scan.nextDouble();
        double produto3 = scan.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Compre o " + produto1 + " pois é mais barato");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("Compre o " + produto2 + " pois é mais barato");
        } else if (produto3 < produto2 && produto3 < produto1) {
            System.out.println("Compre o " + produto3 + " pois é mais barato");
        } else {
            System.out.println("Os produtos são de preços iguais");
        }

    }
}
