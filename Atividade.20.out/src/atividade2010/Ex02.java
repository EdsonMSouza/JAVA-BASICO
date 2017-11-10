package atividade2010;

import java.util.Scanner;

/**
 *
 * @author Edson Melo de Souza
 */
public class Ex02 {

    public static void main(String[] args) {
        int numero;
        String entrada;

        // Cria uma variável para ler os dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Início da leitura
        System.out.print("Digite um número: ");
        entrada = teclado.next();
        numero = Integer.parseInt(entrada);
        
        // Laço de repetição do tipo for em ordem decrescente
        for(int i = numero; i >= 0; i--){
            System.out.println("Número: " + i);
        }
    }

}
