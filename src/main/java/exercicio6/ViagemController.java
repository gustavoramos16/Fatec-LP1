package exercicio6;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class ViagemController {

    @FXML private TextField txtDistancia;
    @FXML private TextField txtPreco;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            double distancia = Componentes.lerDouble(txtDistancia, "Distância");
            double preco = Componentes.lerDouble(txtPreco, "Preço do combustível");
            return new Viagem(distancia, preco).mostrarResultado();
        });
    }
}
