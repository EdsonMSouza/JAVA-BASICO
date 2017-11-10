package heranca;

public class Heranca01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variáveis para saques e depósitos
        double deposito;
        double saque;

        // Declara uma conta
        Conta c = new Conta();
        c.setNumero(123);
        c.setCorrentista("Edson Melo de Souza");
        c.setSaldo(3000);

        // Mostra o saldo atual
        System.out.println("Saldo Atual: " + c.saldo());

        System.out.println("");

        // Tenta realizar um saque
        saque = 1200;
        c.sacar(saque);
        System.out.println("Saque (-):" + saque);

        // Mostra o saldo atual + o limite
        System.out.println("Saldo Atual: " + c.saldo());

        System.out.println("");

        // Realizando um depósito
        deposito = 350;
        c.depositar(deposito);
        System.out.println("Depósito (+): " + deposito);

        // Mostra o saldo atual + o limite
        System.out.println("Saldo Atual: " + c.saldo());
    }

}
