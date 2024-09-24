package com.target.sistemas.terceiro;

public class SomaLoop {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
        // resultado 77.
    }
}
