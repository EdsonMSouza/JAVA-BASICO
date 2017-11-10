package pkg08_tiposcustomizados;

/**
 *
 * @author Edson Melo de Souza
 */
public class Pessoa {

    private int id;
    private String nome;
    private String cpf;
    private Endereco endereco;

    // Métodos Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
