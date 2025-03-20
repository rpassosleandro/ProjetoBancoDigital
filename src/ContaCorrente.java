public class ContaCorrente extends Conta {
    
    //Construtor
    public ContaCorrente (Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(String cliente, int cpf){
        System.out.println(" ");
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirSaldo(cliente, cpf);
        System.out.println("=== xxx====xx   xx====xxxx ===");
        System.out.println(" ");
    }
}
