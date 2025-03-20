public class ContaPoupanca extends Conta {

    //Construtor
    public ContaPoupanca (Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(String cliente, int cpf){
        System.out.println(" ");
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirSaldo(cliente, cpf);
        System.out.println("=== xxx====xx   xx====xxxx ===");
        System.out.println(" ");
    }
}


