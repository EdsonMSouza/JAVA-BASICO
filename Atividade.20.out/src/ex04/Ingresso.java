package ex04;

/**
 *
 * @author Edson Melo de Souza
 */
public class Ingresso {
    double valorIngresso;
    
    public void setIngresso(double ingresso){
        valorIngresso = ingresso;
    }
    
    public void imprimeValor(){
        System.out.println("Valor do ingresso: R$" + valorIngresso);
    }
    
}
