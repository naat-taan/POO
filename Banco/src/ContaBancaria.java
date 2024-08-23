public class ContaBancaria {
    private Cliente cliente;
    private Banco banco;

    public ContaBancaria(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.banco = banco;
    }

    public void depositar(double valor) {
        banco.depositar(valor);
    }

    public void sacar(double valor) {
        banco.sacar(valor);
    }

    public double getSaldo() {
        return banco.getSaldo();
    }
}