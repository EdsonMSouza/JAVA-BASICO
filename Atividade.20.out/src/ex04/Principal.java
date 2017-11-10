package ex04;

/**
 *
 * @author Edson Melo de Souza
 */
public class Principal {

    public static void main(String[] args) {
        Normal n = new Normal();
        n.setIngresso(250.00);
        System.out.println(n.ingressoNormal());

        CamaroteInferior ci = new CamaroteInferior();
        ci.setIngresso(250);
        ci.setLocalizacao("Camarote Inferior");
        System.out.println(ci.getLocalizacao() + " -> " + ci.ingressoVip());

        CamaroteSuperior cs = new CamaroteSuperior();
        cs.setIngresso(250);
        cs.setLocalizacao("Camarote Superior");
        System.out.println(cs.getLocalizacao() + " -> " + cs.camaroteSuperior());
    }
}
