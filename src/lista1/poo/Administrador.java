package lista1.poo;
public class Administrador {
    
    private long cpf;
    private String nome;
    private int telefone;
    private Cliente cliente;
    private Funcionario funcionario;
    private Cardapio lanche;

    //construtor
    public Administrador(long cpf, String nome, int telefone){
        this.cpf=cpf;
        this.nome=nome;
        this.telefone=telefone;
    }
    
    //setters e getters
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    //métodos para exibição dos dados
    public void exibirInfos(){
        System.out.printf("\nNome do administrador: %s", this.nome);
        System.out.printf("\nCpf do administrador: %d", this.cpf);
        System.out.printf("\nTelefone do administrador: %d\n", this.telefone);                          
    }
}