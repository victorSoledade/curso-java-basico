package com.loiane.cursojava.aulas.aula13;

public class OperadoresAritimeticos {
    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);
        //é igual a
        resultado++;
        System.out.println(resultado);

        //5, lembre-se sempre que por o ++ antes ou depois tem efeitos diferentes
        System.out.println(resultado++);
        System.out.println(++resultado); // 7, porque na linha 36 eu mostrei antes de somar, na linha 37 somei antes
        // mesma coisa que += 1

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);

    }
}
