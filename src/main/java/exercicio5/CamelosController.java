package exercicio5;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

import java.util.ArrayList;
import java.util.List;

public class CamelosController {

    @FXML private TextField txtCamelos;
    @FXML private TextField txtParcelas;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            int camelos = Componentes.lerInt(txtCamelos, "Quantidade de camelos");
            List<Integer> parcelas = new ArrayList<>();
            for(String parte : txtParcelas.getText().trim().split("[,;\\s]+")){
                try {
                    int parcela = Integer.parseInt(parte);
                    if(parcela <= 0) throw new NumberFormatException();
                    parcelas.add(parcela);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("as parcelas devem ser inteiros maiores que zero, separados por espaço");
                }
            }
            return new Camelos(camelos, parcelas).mostrarResultado();
        });
    }
}
