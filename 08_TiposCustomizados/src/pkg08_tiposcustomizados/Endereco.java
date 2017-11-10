package pkg08_tiposcustomizados;

/**
 *
 * @author Edson Melo de Souza
 */
public class Endereco {

    private String logradouro;
    private int numero;
    private String bairro;
    private String cep;

    /**
     *
     * Método CONSTRUTOR da classe.
     *
     * <p>
     * Esse método é invocado toda vez em que é criada a instância de um objeto.
     * Com isso é possível já atribuir valores no momento da criação da
     * instância.
     *
     * @param logradouro
     * @param numero
     * @param bairro
     * @param cep
     */
    public Endereco(String logradouro, int numero, String bairro, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
