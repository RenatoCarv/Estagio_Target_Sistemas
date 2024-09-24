package com.target.sistemas.quinto;

import java.util.Random;

/*5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver
as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir
qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas,
qual interruptor controla cada lâmpada? */

public class InterruptoresLuz {
    public static void main(String[] args) {
        // Inicializo um array para as lâmpadas, onde false = apagada e true = acesa
        boolean[] lampadas = new boolean[3];

        // Embaralho as lâmpadas para simular que não sei qual interruptor controla qual
        Random random = new Random();
        int controleA = random.nextInt(3); // Escolho aleatoriamente qual lâmpada o interruptor A vai controlar
        int controleB = (controleA + 1 + random.nextInt(2)) % 3; // Garante que B seja diferente de A
        int controleC = 3 - controleA - controleB; // C é a lâmpada que sobrou

        // Simulo as ações que eu faria
        System.out.println("Ligando o interruptor A por 30 segundos...");
        // Informo que estou ligando o interruptor A
        lampadas[controleA] = true; // Ligo a lâmpada correspondente ao interruptor A
        pause(); // Espero 30 segundos para a lâmpada esquentar

        System.out.println("Desligando o interruptor A...");
        // Informo que estou desligando o interruptor A
        lampadas[controleA] = false; // Desligo a lâmpada correspondente ao interruptor A

        System.out.println("Ligando o interruptor B...");
        // Informo que estou ligando o interruptor B
        lampadas[controleB] = true; // Ligo a lâmpada correspondente ao interruptor B

        // Agora, vou até a sala das lâmpadas para verificar
        System.out.println("Agora, vá até a sala das lâmpadas para verificar:");

        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                // Se a lâmpada está acesa, é a que eu liguei por último
                System.out.println("Lâmpada " + (i + 1) + " está ACESA (controlada pelo interruptor B).");
            } else {
                // Se está apagada, preciso verificar o calor
                System.out.println("Lâmpada " + (i + 1) + " está APAGADA.");
            }
        }

        // Agora identifico as lâmpadas
        System.out.println("Identificando lâmpadas...");
        for (int i = 0; i < lampadas.length; i++) {
            if (i == controleA) {
                // Se a lâmpada estava quente, é a que controlei antes
                System.out.println("Lâmpada " + (i + 1) + " estava QUENTE (controlada pelo interruptor A).");
            } else if (i == controleC) {
                // Se não está acesa e nem quente, é a que sobrou
                System.out.println("Lâmpada " + (i + 1) + " está FRIA (controlada pelo interruptor C).");
            }
        }
    }

    private static void pause() {
        try {
            Thread.sleep(30000); // Aguardo o tempo definido
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Trata a interrupção
        }
    }
}