package separapalavras;

public class SeparaPalavras {

    /**
     * Array com as palavras que devem ser retiradas do texto
     */
    public static String[] palavras = {
        " da ", " de ", " di ", " do ", " du ",
        " das ", " dos ",
        " la ", " le ", " li ", " lo ", " lu ",
        " a ", " e ", " i ", " o ", " u "
    };

    /**
     * Método auxiliar para remover as palavras desejadas
     *
     * @param frase
     * @return
     */
    public static String removePalavras(String frase) {

        /**
         * Laço de repetição que procura cada palavra dentro da frase
         */
        for (String termo : palavras) {
            /**
             * Troca a palavra encontrada por " "
             */
            frase = frase.replace(termo, " ");
        }

        return frase;
    }

    /**
     * Método principal da classe
     * @param args 
     */
    public static void main(String[] args) {
        // Variável que recebe a frase a ser analisada
        String frase = removePalavras("Rua das Neves");

        /**
         * A linha abaixo separa "cada palavra" dentro da frase e coloca em um
         * Array
         *
         * fraseSeparada é uma variável do tipo Array de Strings
         *
         * Split é um método de String que troca um valor dentro de uma
         * sequência de Strings
         *
         * "\\s" é uma Expressão Regular que indica um ESPAÇO
         */
        String[] fraseSeparada = frase.split("\\s");

        /**
         * Percorre o Array criado (fraseSeparada) e mostra "cada" palavra
         *
         * O método "trim" retira os espaços do início e do final de uma
         * sequência de caracteres
         */
        for (String palavra : fraseSeparada) {
            System.out.println(palavra.trim());
        }
    }
}
