package com.target.sistemas.segundo;

import java.util.Scanner;

/*2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente
definida no código;*/

public class LetterACounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma string: ");
        String input = scanner.nextLine();

        int count = 0;

        // Para Verificar cada caractere da string que nós inserirmos.
        for (char ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' ocorre " + count + " vez(es).");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }

        scanner.close();
    }
}
