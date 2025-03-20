public class Cliente {
    //Atributos
    private String nome;
    private int cpf;
    
    //Construtor
    public Cliente(String nome , int cpf) {
        this.nome = nome;
        this.cpf = cpf;  
    }

    //Gets
    public String getNome() {
        return nome;
    }   
    public int getCpf() {
        return cpf;
    }
    
}
