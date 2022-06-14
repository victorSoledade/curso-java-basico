package com.loiane.cursojava.aulas.aula35;

public class Calculadora {
    //5! == 5x4x3x2x1 = 120
    //0! == 1
    public static int fatorialNaoRescursivo(int num) {

        if (num == 0) {
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorial(num - 1);

    }
}
