package bingo;

import java.util.Random;

public class GeraCartelas {

    public static void main(String[] args) {
        int t, i, entrada, controle = 0;
        int aux[] = new int[25];
        int num[][] = new int[5][5];
        Random rand = new Random();

        /**
         * Gera 10 cartelas com 24 números aleatoriamente em cada uma delas
         */
        for (int cartelas = 0; cartelas < 10; cartelas++) {
            /**
             * Gera a cartela individualmente
             */
            for (t = 0; t < 5; t++) {
                for (i = 0; i < 5; i++) {
                    if (t == 2 && i == 2) {
                        num[t][i] = 0;
                    } else {
                        num[t][i] = rand.nextInt((75 - 1) + 1) + 1;
                    }
                }
            }

            /**
             * Mostra a cartela com os números gerados a cada iteração
             */
            for (t = 0; t < 5; ++t) {
                for (i = 0; i < 5; ++i) {
                    if (num[t][i] == -1) {
                        System.out.print("-- ");
                    } else {
                        System.out.print(String.format("%02d", num[t][i]) + " ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
