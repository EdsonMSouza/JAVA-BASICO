package pkg08_tiposcustomizados;

/**
 *
 * @author Edson Melo de Souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instância do objeto Pessoa
        Pessoa p = new Pessoa();

        // Atribuição dos valores por meio dos métodos
        p.setId(1);
        p.setNome("Edson Melo de Souza");
        p.setCpf("123.456.789-00");

        /**
         * O método setEndereco recebe um NOVO objeto "Endereco" Perceba a
         * palavra "new", ela cria uma nova instância do Endereco
         */
        p.setEndereco(new Endereco("Rua Treze de Maio", 25, "Penha", "01234-000"));

        // Mostrando os valores atribuidos
        System.out.println("Id...:" + p.getId());
        System.out.println("Nome.:" + p.getNome());
        System.out.println("CPF..:" + p.getCpf());

        /**
         * Perceba que os dados do endereço são recuperados usando um método do
         * método, ou seja, o objeto endereço está sendo acessado indiretamente
         */
        System.out.println("Rua....: " + p.getEndereco().getLogradouro());
        System.out.println("Número.: " + p.getEndereco().getNumero());
        System.out.println("Bairro.: " + p.getEndereco().getBairro());
        System.out.println("Cep....: " + p.getEndereco().getCep());
    }

}
