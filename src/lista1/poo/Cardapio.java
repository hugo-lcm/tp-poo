package lista1.poo;
public class Cardapio {
    
    private String descricaoDetalhada;
    private String nome;
    private double preco;
    private int idDescricao;
    private static int counter;
    private final static int MAX=10;
    
    //construtor
    public Cardapio(){
        this.descricaoDetalhada=null;
        this.nome=null;
        this.preco=0;
        this.idDescricao=0;
    }
    
    //setters e getters
    public void setDescricaoDetalhada(String descricaoDetalhada){
        this.descricaoDetalhada=descricaoDetalhada;
        addCounter();
    }
    public String getDescricaoDetalhada(){
        return descricaoDetalhada;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getIdDescricao() {
        return this.idDescricao;
    }
    public void setIdDescricao(int idDescricao) {
        this.idDescricao = idDescricao;
    }
    public static int getMAX(){
        return Cardapio.MAX;
    }
    public static int getCounter(){
        return Cardapio.counter;
    }   
    private static void addCounter(){
        Cardapio.counter+=1;
    }
    private static void subCounter(){
        Cardapio.counter-=1;
    }
    
    //método para editar os lanches
    public void editarLanche(String descricaoDetalhada, String nome, double preco, int idDescricao){
        this.setDescricaoDetalhada(descricaoDetalhada);
        this.setNome(nome);
        this.setPreco(preco);
        this.setIdDescricao(idDescricao);
        System.out.println("\no lanche foi editado com sucesso!");
    }

    //método para procrar um lanche através de seu nome
    public static void pesquisarPeloNome(Cardapio produtos[], String nome){
        for(int i = 0; i < Cardapio.getCounter(); i++){
            if(produtos[i].getNome().equals(nome)){
                System.out.println("\nlanche encontrado no cardápio!");
                return;
            }
        }
        System.out.println("\nnão foi possível encontrar um lanche com esse nome"
                + ", tente novamente.");
    }
    
    //metodo para excluir um lanche através de seu nome
    public static void excluirPeloNome(Cardapio lanches[], String nome){
        for(int i = 0; i < Cardapio.getCounter(); i++){
            if(lanches[i].getNome().equals(nome)){
                lanches[i] = lanches[Cardapio.getCounter()-1];
                lanches[Cardapio.getCounter()-1] = null;
                Cardapio.subCounter();
                System.out.println("\no lanche foi excluído com sucesso!");
                return;
            }
            System.out.println("\nnão foi possível encontrar um lanche com esse nome, tente novamente.");
        }
    }
    
    //métodos para exibição dos dados
    public void exibirInfos(){
        System.out.printf("\nNome: %s",this.getNome());
        System.out.printf("\nDescrição: %s",this.getDescricaoDetalhada());
        System.out.printf("\nIdentificador da descrição: %d",this.getIdDescricao());
        System.out.printf("\nPreço: R$%.2f\n",this.getPreco());
    }
    
    public static void mostrarTodasAsInfos(Cardapio produtos[]){
        for(int i = 0; i < Cardapio.getCounter(); i++){
            produtos[i].exibirInfos();
        }
    }
}