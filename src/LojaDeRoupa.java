import java.util.Scanner;

public class LojaDeRoupa {
    String vendedora;
    Produto produto;
    String cliente;

    public void CadastrarVendedora(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da vendedora");
        vendedora = scan.next();
    }

    public void DefinirPrecoProduto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        produto.preco = scan.nextInt();
    }

    public void AtribuirVendedoraParaCliente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da cliente");
        cliente = scan.next();
        System.out.printf("Cliente ", cliente, " atribuida para a vendedora ", vendedora);
    }
}

class Produto{
    String nome;
    int preco;
    Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    };
}
