package heranca;

public class Conta {

    private int numero;
    private String correntista;
    protected double saldo;

    // Métodos Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos de manipulação
    public void depositar(double valor) {
        this.saldo += valor - 0.10;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double saldo() {
        return saldo;
    }

    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
