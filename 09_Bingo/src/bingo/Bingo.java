package bingo;

import java.util.Arrays;
import java.util.Random;

public class Bingo {

    public static void main(String[] args) {
        int t, i, entrada, controle = 0;
        int aux[] = new int[75];
        int num[][] = new int[5][15];

        /**
         * Gera a matriz com os 75 números do bingo
         */
        for (t = 0; t < 5; t++) {
            for (i = 0; i < 15; i++) {
                num[t][i] = (t * 15) + i + 1;
            }
        }

        /**
         * Variável para geração dos números aleatórios do sorteio
         */
        Random rand = new Random();
        do {
            /**
             * Gera o número aleatório a cada iteração
             */
            entrada = rand.nextInt((75 - 1) + 1) + 1;

            /**
             * Pesquisa se o número já foi sorteado, se foi, decrementa o
             * controle para realização de novo sorteio
             */
            for (int k = 0; k < 75; k++) {
                if (aux[k] == entrada) {
                    controle--;
                    break;
                }
            }
            /**
             * Coloca o número sorteado no vetor auxiliar
             */
            aux[controle++] = entrada;
            for (t = 0; t < 5; ++t) {
                for (i = 0; i < 15; ++i) {
                    if (num[t][i] == entrada) {
                        /**
                         * Marca com (-1) o número já sorteado
                         */
                        num[t][i] = -1;
                    }
                }
            }
            /**
             * O laço será repetido 10 vezes, ou seja, 10 sorteios
             */
        } while (controle < 10);

        /**
         * Mostra a matriz, 75 números, com os números sorteados
         */
        System.out.println("\nTabela do BINGO - Números sorteados marcados com \"--\"\n");
        for (t = 0; t < 5; ++t) {
            for (i = 0; i < 15; ++i) {
                /**
                 * Se o número foi sorteado, está marcado com (-1), troca por
                 * dois traços mais um espaço
                 */
                if (num[t][i] == -1) {
                    System.out.print("-- ");
                } else {
                    /**
                     * Mostra os números não sorteados
                     */
                    System.out.print(String.format("%02d", num[t][i]) + " ");
                }
            }
            System.out.println("");
        }

        /**
         * Mostra os números sorteados, separadamente
         */
        System.out.print("\nNúmeros Sorteados: ");
        Arrays.sort(aux);
        for (i = 0; i < 75; i++) {
            if (aux[i] > 0) {
                System.out.print(aux[i] + " ");
            }
        }
        System.out.println("\n\n\n");
    }
}
