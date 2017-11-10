
package ex04;

/**
 *
 * @author Edson Melo de Souza
 */
public class CamaroteSuperior extends Vip {
    private double taxaSuperior = 30;
    //private double valor = valorIngresso + taxaSuperior;
    private String localizacaoIngresso;
    
    public void setLocalizacao(String localizacao){
        localizacaoIngresso = localizacao;
    }
    
    public String getLocalizacao() {
        return localizacaoIngresso;
    }
    
    public double camaroteSuperior() {
        return ingressoVip() + taxaSuperior;
    }  
}
