package exercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class MultiploController {

    @FXML private TextField txtNumero1;
    @FXML private TextField txtNumero2;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            int numero1 = Componentes.lerInt(txtNumero1, "Número 1");
            int numero2 = Componentes.lerInt(txtNumero2, "Número 2");
            return new Multiplo(numero1, numero2).mostrarResultado();
        });
    }
}
