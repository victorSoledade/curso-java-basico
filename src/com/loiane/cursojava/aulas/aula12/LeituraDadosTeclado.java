package com.loiane.cursojava.aulas.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Digite seu nome completo:");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é: " + nomeCompleto);
//
//        System.out.println("Digite seu primeiro nome: ");
//        String primeiroNome = scan.next();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);
//
//        System.out.println("Digite sua idade: ");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é: " + idade);
//
//        System.out.println("Digite sua altura: ");
//        double altura = scan.nextDouble();
//        System.out.println("Sua altura é: "+(double)altura);

        System.out.println("Digite seu primeiro nome, seu main no lol, seu main no valorant, sua skin favorita no valorant, seu pro player fav de valorant e de cs");
        String primeiroNome = scan.next();
        String mainNoLol = scan.next();
        String mainNoValorant = scan.next();
        String skinFavValorant = scan.next();
        String proplayerFavValorant = scan.next();
        String proplayerFavCs = scan.next();

        System.out.println("Você digitou");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Main no lol: " + mainNoLol);
        System.out.println("Main no valorant: " + mainNoValorant);
        System.out.println("Skin favorita no valorant: " + skinFavValorant);
        System.out.println("Pro player favorito de valorant: " + proplayerFavValorant);
        System.out.println("Pro player favorito de cs: " + proplayerFavCs);

    }
}
