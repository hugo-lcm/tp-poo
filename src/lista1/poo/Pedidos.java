package lista1.poo;
public class Pedidos {
    
    private int dataPedido;
    private int horarioPedido;
    private int horarioEntrega;
    private int idDescricao;
    private int idAdicionais;
    private int idPedido;

    //construtor
    public Pedidos(int dataPedido, int horarioPedido, int horarioEntrega, int idDescricao, int idAdicionais, int idPedido) {
        this.dataPedido = dataPedido;
        this.horarioPedido = horarioPedido;
        this.horarioEntrega = horarioEntrega;
        this.idDescricao = idDescricao;
        this.idAdicionais = idAdicionais;
        this.idPedido = idPedido;
    } 
    
    //setters e getters
    public void setDataPedido(int dataPedido){
        this.dataPedido=dataPedido;
    }
    public int getDataPedido(){
        return dataPedido;
    }
    public void setHorarioPedido(int horarioPedido){
        this.horarioPedido=horarioPedido;
    }
    public int getHorarioPedido(){
        return horarioPedido;
    }
    public void setHorarioEntrega(int horarioEntrega){
        this.horarioEntrega=horarioEntrega;
    }
    public int getHorarioEntrega(){
        return horarioEntrega;
    }
    public void setIdDescricao(int idDescricao){
        this.idDescricao=idDescricao;
    }
    public int getIdDescricao(){
        return idDescricao;
    }
    public void setIdAdicionais(int idAdicionais){
        this.idAdicionais=idAdicionais;
    }
    public int getIdAdicionais(){
        return idAdicionais;
    }
    public void setIdPedido(int idPedido){
        this.idPedido=idPedido;
    }
    public int getIdPedido(){
        return idPedido;
    }
    
    //métodos para exibição dos dados
    public void showInfos(){
        System.out.printf("\nData do pedido: %d", this.dataPedido);
        System.out.printf("\nHorário: %d", this.horarioPedido);
        System.out.printf("\nHorário da entrega: %d", this.horarioEntrega);
        System.out.printf("\nIdentificador da descrição: %d", this.idDescricao);
        System.out.printf("\nIdentificador dos adicionais: %d", this.idAdicionais);
        System.out.printf("\nIdentificador do pedido: %d\n", this.idPedido);
    }
}