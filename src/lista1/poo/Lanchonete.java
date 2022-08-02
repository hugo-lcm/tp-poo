package lista1.poo;

//import java.util.HashSet;

public class Lanchonete {
    public static void main(String[] args) {
        
        //inserindo administradores
        System.out.println("- - - - - Administradores - - - - -");
        Administrador adm1 = new Administrador(11111111111l,"José da Silva", 35261258);
        adm1.exibirInfos();
        Administrador adm2 = new Administrador(22222222222l,"Maria Odete", 35261391);
        adm2.exibirInfos();
                
        
        //inserindo funcionários
        System.out.println("\n- - - - - Funcionários - - - - -");
        Funcionario employees[] = new Funcionario[Funcionario.getMAX()];
        for(int i = 0;i < Funcionario.getMAX();i++)
            employees[i] = new Funcionario();
            employees[0].setCpf(33333333333l);
            employees[0].setNome("Enzo");
            employees[0].setEndereco("Av. Januário Ribeiro, N547");
            employees[0].exibirInfos();       
            employees[1].adicionarFuncionario(44444444444l, "Valentina", "Rua Mestre Roque, N93");
            employees[1].exibirInfos();
            employees[2].adicionarFuncionario(55555555555l, "Cleiton", "Av. Murilo Nicolau, N1023");
            employees[2].exibirInfos();
            employees[3].adicionarFuncionario(66666666666l, "Igor", "Praça Dr. Prado, N170");
            employees[3].exibirInfos();
            employees[4].adicionarFuncionario(77777777777l, "Maria", "Rua do Carmo, N99");
            employees[4].exibirInfos();
        
            
        //inserindo clientes
        System.out.println("\n- - - - - Clientes - - - - -");
        Cliente clientes[] = new Cliente[Cliente.getMAX()];
        for(int i = 0;i < Cliente.getMAX();i++)
            clientes[i] = new Cliente();
            clientes[0].setNome("Alexandre");
            clientes[0].setEndereco("Avenida Brasil, N12");
            clientes[0].setTelefone(35316927);
            clientes[0].exibirInfos();       
            clientes[1].adicionarCliente("Thamires", "Beco das Beatas, N49, Centro", 35313838);
            clientes[1].exibirInfos();

            
        //inserindo lanches no cardápio
        System.out.println("\n- - - - - Cardápio - - - - -");
        Cardapio lanches[] = new Cardapio[Cardapio.getMAX()];
        for(int i = 0;i < Cardapio.getMAX();i++)
            lanches[i] = new Cardapio();
            lanches[0].setDescricaoDetalhada("Pão, hamburguer de boi, queijo, batata palha, alface e tomate.");
            lanches[0].setNome("X-Burguer");
            lanches[0].setPreco(8.99);
            lanches[0].setIdDescricao(1);
            lanches[1].setDescricaoDetalhada("Pão, hamburguer de boi, queijo, ovo, bacon, milho, "
                    + "presunto, batata palha, alface e tomate");
            lanches[1].setNome("X-Tudo");
            lanches[1].setPreco(13.99);
            lanches[1].setIdDescricao(2);
            Cardapio.mostrarTodasAsInfos(lanches);
            
            //pesquisar, editar e excluir lanches
            Cardapio.pesquisarPeloNome(lanches, "X-Pão");
            lanches[1].editarLanche("Pão, 2 hamburguers de boi, 2x queijo, 2x ovo, 2x bacon, 2x milho, "
                    + " 2x presunto, 2x batata palha, alface e tomate", "X-Tudo Duplo", 17.99, 2);
            Cardapio.excluirPeloNome(lanches, "X-Burguer"); //após o método de excluir fica exibindo as infos com os valores 0 e null no lugar do 
                                                            //lanche que foi excluído, não consegui descobrir como arrumar isso
            Cardapio.mostrarTodasAsInfos(lanches);
            
            
        //inserindo um pedido
        System.out.println("\n- - - - - Pedidos - - - - -");
        Pedidos pedido1 = new Pedidos(27042019, 1539, 1645, 1, 0, 12);
        pedido1.showInfos();
        
        System.out.println();
    }    
}