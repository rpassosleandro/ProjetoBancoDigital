public class Banco {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Leandro", 1234);
        Cliente cliente2 = new Cliente("Michele", 4321);

        Conta contaCorrente1 = new ContaCorrente(cliente1);
        Conta contaPoupanca1 = new ContaPoupanca(cliente1);
        Conta contaCorrente2 = new ContaCorrente(cliente2);

        contaCorrente1.depositar(150.50, contaCorrente1.numero);
        contaCorrente1.depositar(50.00, contaCorrente1.numero);
        contaCorrente2.depositar(50.00, contaCorrente2.numero);
        contaPoupanca1.depositar(30.00, contaPoupanca1.numero);
        
        contaCorrente1.imprimirExtrato(cliente1.getNome(),cliente1.getCpf());
        contaCorrente2.imprimirExtrato(cliente2.getNome(),cliente2.getCpf());
        contaPoupanca1.imprimirExtrato(cliente1.getNome(),cliente1.getCpf());

        contaCorrente1.transferir(50, contaPoupanca1, contaCorrente1.numero, contaPoupanca1.numero);
        contaCorrente1.imprimirExtrato(cliente1.getNome(),cliente1.getCpf());
        contaPoupanca1.imprimirExtrato(cliente1.getNome(),cliente1.getCpf());

        contaCorrente2.sacar(90,contaCorrente2.numero);

    }
}
