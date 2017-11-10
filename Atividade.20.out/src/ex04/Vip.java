package ex04;

/**
 *
 * @author Edson Melo de Souza
 */
public class Vip extends Ingresso {
    private final double valorAdicional = 80;
    
    public double ingressoVip() {
        valorIngresso = valorIngresso + valorAdicional;
       return valorIngresso;
    }
}    
 
