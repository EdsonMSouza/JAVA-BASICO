package pkg07_manipulandoclasses;

/**
 *
 * @author Edson Melo de Souza
 */
public class Main {

    public static void main(String[] args) {
        // Declaração da variável
        OperacoesMatematicas calculos = new OperacoesMatematicas();

        // Realizando uma soma entre dois números
        System.out.println(calculos.soma(10, 20));

        // Declaração de um array de valores
        double[] valores = new double[3];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;

        // Realizando uma soma de vários números
        System.out.println(calculos.soma(valores));
    }

}
