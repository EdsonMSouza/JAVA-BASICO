package atividade2010;

import java.util.Scanner;

/**
 *
 * @author Edson Melo de Souza MaiorNumero
 */
public class Ex01 {

    public static void main(String[] args) {
        // Variáveis para receber os valores informados
        int n1;
        int n2;
        String entrada;

        // Cria uma variável para ler os dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Início da leitura
        System.out.print("Digite o primeiro número: ");
        entrada = teclado.next();
        n1 = Integer.parseInt(entrada);

        // Leitura do segundo número
        System.out.print("Digite o segundo número.: ");
        entrada = teclado.next();
        n2 = Integer.parseInt(entrada);

        // Realiza a comparação
        if (n1 > n2) {
            System.out.println("Números digitados: n1=" +n1 + ", n2=" +n2 + ", maior: " + n1);
        } else {
            System.out.println("Números digitados: n1=" +n1 + ", n2=" +n2 + ", maior: " + n2);
        }

    }
}
