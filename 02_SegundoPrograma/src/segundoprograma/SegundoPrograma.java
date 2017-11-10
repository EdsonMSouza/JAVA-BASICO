package segundoprograma;

/**
 *
 * @author Edson Melo de Souza
 */
public class SegundoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando um novo Carro
        Carro c = new Carro();
        
        /**
         * Atribuindo valores através dos métodos
         * 
         * Perceba que não há mais o sinal de atribuição (=) como no 
         * exemplo anterior PrimeiroPrograma 
         */
        c.setChassi("A12345B");
        c.setCor("Azul");
        c.setModelo("Uno");
        
        // Apresentando os valores armazenados via método get
        System.out.println("Chassi...: " + c.getChassi());
        System.out.println("Cor......: " + c.getCor());
        System.out.println("Modelo...: " + c.getModelo());
        System.out.println("");
        
        // Alterando o valor de um atributo do Carro e mostrando o resultado
        c.setCor("Amarelo");
        
        // Apresentando os valores armazenados via método get
        System.out.println("Chassi...: " + c.getChassi());
        System.out.println("Cor......: " + c.getCor());
        System.out.println("Modelo...: " + c.getModelo());        
        System.out.println("");
        
        // Criando um novo Carro
        Carro c2 = new Carro();
        // Atribuindo os valores
        c2.setChassi("F9978R12");
        c2.setCor("Vermelho");
        c2.setModelo("Ferrari");
        
        // Apresentando os valores armazenados via método get
        System.out.println("Novo Carro");
        System.out.println("Chassi...: " + c2.getChassi());
        System.out.println("Cor......: " + c2.getCor());
        System.out.println("Modelo...: " + c2.getModelo());
    }
    
}
