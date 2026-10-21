package exercicio8;

public class LojaDeRoupa {
    String vendedora;
    Produto produto = new Produto("", 0);
    String cliente;

    public void cadastrarVendedora(String vendedora){
        this.vendedora = vendedora;
    }

    public void definirProduto(String nome, double preco){
        produto.nome = nome;
        produto.preco = preco;
    }

    public void atribuirVendedoraParaCliente(String cliente){
        this.cliente = cliente;
    }

    public String mostrarResultado(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Cliente %s atribuída para a vendedora %s%n", cliente, vendedora));
        sb.append(String.format("Produto: %s - R$ %.2f%n", produto.nome, produto.preco));
        return sb.toString();
    }
}

class Produto{
    String nome;
    double preco;
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}
