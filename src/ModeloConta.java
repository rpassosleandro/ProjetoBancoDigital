public interface ModeloConta {
    public void sacar(double valor, int contaSacada);
    public void depositar(double valor, int contaDepositada);
    public void transferir(double valor, Conta contaDestino, int contaSacada, int contaDepositada);
    public void imprimirSaldo(String cliente, int cpf);
}
