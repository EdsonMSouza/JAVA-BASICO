package trycatchfinally;

import java.util.*;

public class TryCatchFinally {

    public static void main(String[] args) {

        // Declaração da variável para realizar a leitura do teclado
        Scanner in = new Scanner(System.in);

        // Declaração das variáveis numéricas para receber os valores informados
        double n1, n2;

        // Declaração da variável para armazenar o valor lido do teclado
        String entrada;

        try {  //início do bloco que será monitorado
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
                System.out.println("\n");

            } while (n1 != -1);

        } catch (ArithmeticException ae) {  // tratamento de erro
            System.out.println("Erro provável:  divisão por zero:" + ae.getMessage());

        } catch (NumberFormatException nfe) {  // tratamento de erro
            System.out.println("Tipos de dados incompatíveis:" + nfe.getMessage());

        } catch (Exception e) {   // tratamento de erro
            System.out.println("Erro genérico:" + e.getMessage());
            System.out.println("Mostra o pacote, a exceção e mensagem de erro:" + e.toString());

        } finally {  // bloco final: é executado independentemente do que aconteceu acima
            n1 = 0;
            n2 = 0;
            System.out.println("Saiu do Programa!");
        }
    }
}
