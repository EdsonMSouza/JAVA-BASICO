package atividade2010;

/**
 *
 * @author Edson Melo de Souza
 */
public class Ex03 {

    public static void main(String[] args) {
        long soma = 0;

        for (int i = 1; i < 30; i++) {
            if ((i % 2) == 0) {
                soma += i;
            }
        }
        System.out.println("Total: " + soma);

        long multiplicacao = 1;

        for (int i = 2; i < 30; i++) {
            if ((i % 2) == 0) {
                multiplicacao *= i;
            }
        }
        System.out.println("Total: " + multiplicacao);
    }
}
