package exercicio3;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

import java.util.List;

public class MercadoController {

    @FXML private TextField txtArroz;
    @FXML private TextField txtFeijao;
    @FXML private TextField txtOleo;
    @FXML private TextField txtAcucar;
    @FXML private TextField txtCafe;
    @FXML private TextField txtMacarrao;
    @FXML private TextField txtFarinha;
    @FXML private TextField txtFuba;
    @FXML private TextField txtMolho;
    @FXML private TextField txtSal;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            //mesma ordem dos itens em Mercado.definirItens()
            List<TextField> campos = List.of(txtArroz, txtFeijao, txtOleo, txtAcucar, txtCafe,
                    txtMacarrao, txtFarinha, txtFuba, txtMolho, txtSal);
            Mercado mercado = new Mercado();
            List<String> nomes = mercado.nomesDosItens();
            for(int i = 0; i < campos.size(); i++){
                mercado.definirPreço(i, Componentes.lerDouble(campos.get(i), nomes.get(i)));
            }
            return mercado.mostrarResultado();
        });
    }
}
