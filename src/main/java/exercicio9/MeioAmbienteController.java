package exercicio9;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class MeioAmbienteController {

    @FXML private TextField txtArvore;
    @FXML private TextField txtFolhas;
    @FXML private TextField txtSolo;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            MeioAmbiente meioAmbiente = new MeioAmbiente();
            meioAmbiente.definirNomeDaArvore(Componentes.lerTexto(txtArvore, "Nome da árvore"));
            meioAmbiente.definirQuantidadeDeFolhasPorArvore(Componentes.lerInt(txtFolhas, "Quantidade de folhas"));
            meioAmbiente.definirTipoDeSolo(Componentes.lerTexto(txtSolo, "Tipo de solo"));
            return meioAmbiente.mostrarResultado();
        });
    }
}
