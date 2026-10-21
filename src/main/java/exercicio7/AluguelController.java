package exercicio7;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class AluguelController {

    @FXML private TextField txtDias;
    @FXML private TextField txtKm;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            int dias = Componentes.lerInt(txtDias, "Quantidade de dias");
            double km = Componentes.lerDouble(txtKm, "Quilometragem");
            return new Aluguel(dias, km).mostrarResultado();
        });
    }
}
