package leiturapeloteclado;

import java.util.*;

public class LeituraPeloTeclado {

    public static void main(String[] args) {

        // Declaração da variável para realizar a leitura do teclado
        Scanner in = new Scanner(System.in);

        // Declaração das variáveis numéricas para receber os valores informados
        double n1, n2;

        // Declaração da variável para armazenar o valor lido do teclado
        String entrada;

        // Inicio do laço de repetição
        do {
            // Leitura do primeiro número
            System.out.print("Digite o primeiro número: ");
            entrada = in.next();
            n1 = Integer.parseInt(entrada);

            // Leitura do segundo número
            System.out.print("Digite o segundo número.: ");
            entrada = in.next();
            n2 = Integer.parseInt(entrada);

            // Realiza a operação de divisão e mostra o resultado
            System.out.print("A divisão entre eles é..: " + (n1 / n2));
            System.out.println("\n\n");

        } while (n1 != -1); // Realiza o loop até que n1 seja diferente de (-1)

        System.out.println("Fim do Programa!");
    }
}
