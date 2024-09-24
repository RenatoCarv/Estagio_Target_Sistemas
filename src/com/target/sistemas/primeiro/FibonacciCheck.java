package com.target.sistemas.primeiro;

import java.util.Scanner;

/* 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. */

public class FibonacciCheck {

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c = 0;

        if (n == 0 || n == 1) return true; // 0 e 1 pertencem à sequência

        while (c < n) {
            c = a + b; // Próximo número da sequência
            a = b;
            b = c;
        }

        return c == n; // Verifica se encontrou o número
    }

    public static void printFibonacciUpTo(int n) {
        int a = 0, b = 1;
        boolean exists = false;

        System.out.print("Sequência de Fibonacci até " + n + ": ");

        if (n >= 0) System.out.print(a + " ");
        if (n >= 1) System.out.print(b + " ");

        while (b <= n) {
            int c = a + b; // Próximo número
            System.out.print(c + " ");
            a = b;
            b = c;
            if (c == n) exists = true; // Marca se o número está na sequência
        }

        System.out.println();

        if (!exists)
            System.out.println("O número " + n + " NÃO pertence à sequência de Fibonacci.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Informe um número: ");
            number = scanner.nextInt();

            if (isFibonacci(number)) {
                printFibonacciUpTo(number);
                System.out.println("O número " + number + " pertence à sequência de Fibonacci!");
                break;
            } else {
                System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci. Tente novamente.");
            }
        }

        scanner.close(); // Fecha o scanner
    }
}