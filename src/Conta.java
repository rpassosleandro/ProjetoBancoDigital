public abstract class Conta implements ModeloConta {
    //Atributos
    protected int numero;
    protected double saldo;
    protected int agencia;

    private static final int agenciaPadrao = 1;
    private static int numeroSequencialConta = 1;

    //Construtor
    public Conta(Cliente cliente) {
        this.numero = numeroSequencialConta++;
        this.agencia = agenciaPadrao;
        this.saldo = 0;
    }

    //Gets
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }

    //Sets
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
    //Métodos
    @Override
    public void sacar(double valor, int contaOrigem) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " na conta "+ contaOrigem + " efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor, int contaDestino) {
        if (valor > 0) {
            saldo += valor;
            System.out.println(String.format("Depósito de %.2f na conta %d efetuado com sucesso!",valor, contaDestino));
        } else {
            System.out.println("Valor inválido!");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino, int contaSacada, int contaDepositada) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor, contaSacada);
            contaDestino.depositar(valor, contaDepositada);
            System.out.println("Transferência de "+ valor + " da conta "+ contaSacada + " para conta "+ contaDepositada + " efetuada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void imprimirSaldo(String cliente, int cpf) {
        System.out.println(String.format("Cliente: %s", cliente));
        System.out.println(String.format("CPF: %d", cpf));
        System.out.println(String.format("Agência: %d", agenciaPadrao));
        System.out.println(String.format("Conta: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    protected abstract void imprimirExtrato(String cliente, int cpf);


}
