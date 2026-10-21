package exercicio8;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class LojaController {

    @FXML private TextField txtVendedora;
    @FXML private TextField txtMatricula;
    @FXML private TextField txtComissao;
    @FXML private TextField txtProduto;
    @FXML private TextField txtTamanho;
    @FXML private TextField txtPreco;
    @FXML private TextField txtCliente;
    @FXML private TextField txtCpf;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            LojaDeRoupa loja = new LojaDeRoupa();
            loja.vendedora.cadastrarVendedora(Componentes.lerTexto(txtVendedora, "Vendedora"),
                    Componentes.lerTexto(txtMatricula, "Matrícula"));
            loja.vendedora.definirComissao(Componentes.lerDouble(txtComissao, "Comissão (%)"));
            loja.produto.cadastrarProduto(Componentes.lerTexto(txtProduto, "Produto"),
                    Componentes.lerTexto(txtTamanho, "Tamanho"));
            loja.produto.definirPrecoProduto(Componentes.lerDouble(txtPreco, "Preço do produto"));
            loja.cliente.cadastrarCliente(Componentes.lerTexto(txtCliente, "Cliente"),
                    Componentes.lerTexto(txtCpf, "CPF"));
            loja.cliente.atribuirVendedoraParaCliente(loja.vendedora);
            return loja.mostrarResultado();
        });
    }
}
