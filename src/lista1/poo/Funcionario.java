package lista1.poo;
public class Funcionario {
    
    private long cpf;
    private String nome;
    private String endereco;
    private Pedidos pedido;
    private static int counter;
    private final static int MAX=5;
    
    //construtor
    public Funcionario() {
        this.cpf=0;
        this.nome=null;
        this.endereco=null;
    }
    //setters e getters
    public void setCpf(long cpf){
        this.cpf=cpf;
        addCounter();
    }
    public long getCpf(){
        return cpf;
    }
    public void setNome(String nome){
        this.nome=nome;
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
    public static int getMAX(){
        return Funcionario.MAX;
    }
    public static int getCounter(){
        return Funcionario.counter;
    }
    private static void addCounter(){
        Funcionario.counter+=1;
    }
    
    //método para adicionar novos funcionários
    public void adicionarFuncionario(long cpf, String nome, String endereco){
        if(Funcionario.getCounter() < Funcionario.getMAX()){
            this.cpf=cpf;
            this.nome=nome;
            this.endereco=endereco;
        }
    }
    
    //método para exibição dos dados do funcionário
    public void exibirInfos(){
        System.out.printf("\nNome: %s", this.nome);
        System.out.printf("\nCpf: %d", this.cpf);
        System.out.printf("\nEndereco: %s\n", this.endereco);
    }
}