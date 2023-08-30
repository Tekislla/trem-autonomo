package main.java;

public class Exercicio1 {
    public static void main(String[] args) {
        String[] comandos = {"direita", "direita", "direita", "esquerda", "esquerda", "direita", "esquerda", "direita", "esquerda", "direita"};

        int posicaoAtual = 0;

        for (String comando : comandos) {
            if (comando.equals("direita")) {
                posicaoAtual++;
            } else if (comando.equals("esquerda")) {
                posicaoAtual--;
            } else {
                System.out.println("Comando inválido: " + comando);
            }
        }

        // Garantindo que o trem permaneça dentro dos limites -m e m
        //int m = 2;
        //posicaoAtual = Math.max(-m, Math.min(m, posicaoAtual));

        System.out.println("Posição final do trem: " + posicaoAtual);
    }
}