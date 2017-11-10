package heranca;

public class ContaCorrente extends Conta {

    // Reescrevendo o método atualizar
    @Override
    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

}
