package exercicio8;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class LojaController {

    @FXML private TextField txtVendedora;
    @FXML private TextField txtProduto;
    @FXML private TextField txtPreco;
    @FXML private TextField txtCliente;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            LojaDeRoupa loja = new LojaDeRoupa();
            loja.cadastrarVendedora(Componentes.lerTexto(txtVendedora, "Vendedora"));
            loja.definirProduto(Componentes.lerTexto(txtProduto, "Produto"),
                    Componentes.lerDouble(txtPreco, "Preço do produto"));
            loja.atribuirVendedoraParaCliente(Componentes.lerTexto(txtCliente, "Cliente"));
            return loja.mostrarResultado();
        });
    }
}
