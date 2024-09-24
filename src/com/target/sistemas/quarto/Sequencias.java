package com.target.sistemas.quarto;

public class Sequencias {
    public static void main(String[] args) {

        // a) 1, 3, 5, 7, ___
        int a = 7 + 2; // Próximo ímpar
        System.out.println("a) " + a); // Resultado: 9

        // b) 2, 4, 8, 16, 32, 64, ____
        int b = 64 * 2; // Próximo elemento é o dobro do anterior
        System.out.println("b) " + b); // Resyltado: 128

        // c) 0, 1, 4, 9, 16, 25, 36, ____
        int c = (6 * 6); // Próximo quadrado número por número (6²)
        System.out.println("c) " + c); // Resultado: 49

        // d) 4, 16, 36, 64, ____
        int d = (10 * 10); // Próximo quadrado do número par (10²)
        System.out.println("d) " + d); // Resultado: 100

        // e) 1, 1, 2, 3, 5, 8, ____
        int e1 = 5;
        int e2 = 8;
        int e = e1 + e2; // Próximo número da sequência de Fibonacci (8+5)
        System.out.println("e) " + e); // Resultado: 13

        // f) 2, 10, 12, 16, 17, 18, 19, ____
        int f = 19 + 1; // Próximo número consecutivo após 19
        System.out.println("f) " + f); // Resultado: 20
    }
}
