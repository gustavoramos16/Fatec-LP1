package exercicio4;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class TemperaturaController {

    @FXML private TextField txtTemperatura;
    @FXML private ListView<Double> lista;
    @FXML private TextArea resultado;

    @FXML
    private void adicionar(){
        try {
            lista.getItems().add(Componentes.lerDouble(txtTemperatura, "Temperatura"));
            txtTemperatura.clear();
            txtTemperatura.requestFocus();
        } catch (IllegalArgumentException ex) {
            resultado.setText("Erro: " + ex.getMessage());
        }
    }

    @FXML
    private void limpar(){
        lista.getItems().clear();
        resultado.clear();
    }

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            if(lista.getItems().isEmpty()){
                throw new IllegalArgumentException("adicione pelo menos uma temperatura");
            }
            Temperatura temperatura = new Temperatura();
            lista.getItems().forEach(temperatura::receberTemperatura);
            return temperatura.mostrarResultado();
        });
    }
}
