package pkg07_manipulandoclasses;

/**
 *
 * @author Edson Melo de Souza
 */
public class OperacoesMatematicas {

    // Soma entre dois valores
    public double soma(double n1, double n2) {
        return n1 + n2;
    }

    // Soma entre diversos valores (utilização de arrays)
    public double soma(double[] n) {
        double retorno = 0.0;
        for (int i = 0; i < n.length; i++) {
            retorno += n[i];
        }
        return retorno;
        
    }

    // Multiplicação entre dois valores
    public double multiplica(double n1, double n2) {
        return n1 + n2;
    }

    // Multiplicação entre diversos valores (utilização de arrays)
    public double multiplica(double[] n) {
        double retorno = 0.0;
        for (int i = 0; i < n.length; i++) {
            retorno += n[i];
        }
        return retorno;
    }
}
