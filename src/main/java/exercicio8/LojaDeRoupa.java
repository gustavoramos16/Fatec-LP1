package exercicio8;

public class LojaDeRoupa {
    Vendedora vendedora = new Vendedora();
    Produto produto = new Produto();
    Cliente cliente = new Cliente();

    public boolean verificarAtribuicao(){
        return cliente.vendedora != null;
    }

    public double calcularComissaoDaVenda(){
        return vendedora.calcularComissao(produto.preco);
    }

    public String mostrarResultado(){
        StringBuilder sb = new StringBuilder();
        if(verificarAtribuicao()){
            sb.append(String.format("Cliente %s atribuída para a vendedora %s%n%n", cliente.nome, cliente.vendedora.nome));
        }
        sb.append(vendedora.mostrarDados());
        sb.append(produto.mostrarDados());
        sb.append(cliente.mostrarDados());
        sb.append(String.format("Comissão da venda: R$ %.2f%n", calcularComissaoDaVenda()));
        return sb.toString();
    }
}

class Vendedora{
    String nome;
    String matricula;
    double comissao;

    public void cadastrarVendedora(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void definirComissao(double percentual){
        this.comissao = percentual;
    }

    public double calcularComissao(double valorVenda){
        return valorVenda * comissao / 100;
    }

    public String mostrarDados(){
        return String.format("Vendedora: %s (matrícula %s) - comissão de %.1f%%%n", nome, matricula, comissao);
    }
}

class Produto{
    String nome;
    String tamanho;
    double preco;

    public void cadastrarProduto(String nome, String tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void definirPrecoProduto(double preco){
        this.preco = preco;
    }

    public String mostrarDados(){
        return String.format("Produto: %s (tamanho %s) - R$ %.2f%n", nome, tamanho, preco);
    }
}

class Cliente{
    String nome;
    String cpf;
    Vendedora vendedora;

    public void cadastrarCliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void atribuirVendedoraParaCliente(Vendedora vendedora){
        this.vendedora = vendedora;
    }

    public String mostrarDados(){
        return String.format("Cliente: %s (CPF %s)%n", nome, cpf);
    }
}
