package exercicio9;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class MeioAmbienteController {

    @FXML private TextField txtArvore;
    @FXML private TextField txtAltura;
    @FXML private TextField txtIdade;
    @FXML private TextField txtFolhas;
    @FXML private TextField txtCorFolha;
    @FXML private TextField txtFormatoFolha;
    @FXML private TextField txtSolo;
    @FXML private TextField txtPh;
    @FXML private TextField txtUmidade;
    @FXML private TextArea resultado;

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> {
            MeioAmbiente meioAmbiente = new MeioAmbiente();
            meioAmbiente.arvore.definirNomeDaArvore(Componentes.lerTexto(txtArvore, "Nome da árvore"));
            meioAmbiente.arvore.definirMedidas(Componentes.lerDouble(txtAltura, "Altura (m)"),
                    Componentes.lerInt(txtIdade, "Idade (anos)"));
            meioAmbiente.folhas.definirQuantidadeDeFolhasPorArvore(Componentes.lerInt(txtFolhas, "Quantidade de folhas"));
            meioAmbiente.folhas.definirCaracteristicas(Componentes.lerTexto(txtCorFolha, "Cor da folha"),
                    Componentes.lerTexto(txtFormatoFolha, "Formato da folha"));
            meioAmbiente.terra.definirTipoDeSolo(Componentes.lerTexto(txtSolo, "Tipo de solo"));
            meioAmbiente.terra.definirPhEUmidade(Componentes.lerDouble(txtPh, "pH"),
                    Componentes.lerDouble(txtUmidade, "Umidade (%)"));
            return meioAmbiente.mostrarResultado();
        });
    }
}
