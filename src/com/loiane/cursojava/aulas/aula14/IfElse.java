package com.loiane.cursojava.aulas.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Entre com a sua idade");
//        int idade = scan.nextInt();
//
//        if (idade >= 18){
//            System.out.println("Você é maior de idade!");
//            return;
//        }
//        System.out.println("Você é menor de idade.");

        /* barato <= 10, mediano > 10 < 15, talvez >15 < 17, >= 17 não! */

        System.out.println("Digite o preço do produto: ");
        double precoProduto = scan.nextDouble();

        if (precoProduto < 0) {
            System.out.println("Isto está sendo dado de graça, não vale :(");
        } else if (precoProduto <= 10) {
            System.out.println("Compre agora! está muito barato!");
        } else if (precoProduto > 10 && precoProduto < 15) {
            System.out.println("O preço ainda está bom! talvez valha apena!");
        } else if (precoProduto >= 15 && precoProduto < 17) {
            System.out.println("Pesquise mais, talvez haja lugares mais baratos");
        } else {
            System.out.println("Tá maluco!! Isso tá muito caro!");
        }
    }
}
