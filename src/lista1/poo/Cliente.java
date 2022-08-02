package lista1.poo;
public class Cliente {
    
    private String nome;
    private String endereco;
    private int telefone;
    private static int counter;
    private final static int MAX=100;
    
    //construtor
    public Cliente(){
        this.nome=null;
        this.endereco=null;
        this.telefone=0;
    }
    
    //setters e getters
    public void setNome(String nome){
        this.nome=nome;
        addCounter();
    }
    public String getNome(){
        return nome;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setTelefone(int telefone){
        this.telefone=telefone;
    }
    public int getTelefone(){
        return telefone;
    }
    public static int getMAX(){
        return Cliente.MAX;
    }
    public static int getCounter(){
        return Cliente.counter;
    }
    
    private static void addCounter(){
        Cliente.counter+=1;
    }
    
    //método para adicionar novos clientes
    public void adicionarCliente(String nome, String endereco, int telefone){
        if(Cliente.getCounter() < Cliente.getMAX()){
            this.nome=nome;
            this.endereco=endereco;
            this.telefone=telefone;
        }
    }
    //métodos para exibição dos dados
    public void exibirInfos(){
        System.out.printf("\nNome do cliente: %s", this.nome);
        System.out.printf("\nEndereço: %s", this.endereco);
        System.out.printf("\nTelefone: %s\n", this.telefone);
    }
}