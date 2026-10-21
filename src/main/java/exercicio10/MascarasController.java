package exercicio10;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class MascarasController {

    @FXML private TextField txtBoca;
    @FXML private TextField txtCorBoca;
    @FXML private TextField txtTamanhoBoca;
    @FXML private TextField txtOlho;
    @FXML private TextField txtTipoOlho;
    @FXML private TextField txtCorOlho;
    @FXML private TextField txtNariz;
    @FXML private TextField txtFormatoNariz;
    @FXML private TextField txtTamanhoNariz;
    @FXML private TextField txtBuscarTipo;
    @FXML private TextField txtEditarBoca;
    @FXML private TextField txtEditarOlho;
    @FXML private TextField txtEditarNariz;
    @FXML private TextArea resultado;

    private final Mascaras mascaras = new Mascaras();

    @FXML
    private void definir(){
        Componentes.calcular(resultado, () -> {
            String boca = Componentes.lerTexto(txtBoca, "Característica da boca");
            String corBoca = Componentes.lerTexto(txtCorBoca, "Cor da boca");
            String tamanhoBoca = Componentes.lerTexto(txtTamanhoBoca, "Tamanho da boca");
            String olho = Componentes.lerTexto(txtOlho, "Característica do olho");
            String tipoOlho = Componentes.lerTexto(txtTipoOlho, "Tipo do olho");
            String corOlho = Componentes.lerTexto(txtCorOlho, "Cor do olho");
            String nariz = Componentes.lerTexto(txtNariz, "Característica do nariz");
            String formatoNariz = Componentes.lerTexto(txtFormatoNariz, "Formato do nariz");
            String tamanhoNariz = Componentes.lerTexto(txtTamanhoNariz, "Tamanho do nariz");
            mascaras.boca.definirBoca(boca, corBoca, tamanhoBoca);
            mascaras.olho.definirOlho(olho, tipoOlho, corOlho);
            mascaras.nariz.definirNariz(nariz, formatoNariz, tamanhoNariz);
            return "Máscara definida\n" + mascaras.mostrarResultado();
        });
    }

    @FXML
    private void limpar(){
        mascaras.limparMascara();
        resultado.setText("Máscara limpa");
    }

    @FXML
    private void buscar(){
        Componentes.calcular(resultado, () -> {
            verificarDefinida();
            return mascaras.olho.buscarTipoDeOlhoPorMascara(Componentes.lerTexto(txtBuscarTipo, "Tipo de olho"));
        });
    }

    @FXML
    private void editar(){
        Componentes.calcular(resultado, () -> {
            verificarDefinida();
            mascaras.boca.editarBoca(txtEditarBoca.getText().trim());
            mascaras.olho.editarOlho(txtEditarOlho.getText().trim());
            mascaras.nariz.editarNariz(txtEditarNariz.getText().trim());
            return "Máscara editada\n" + mascaras.mostrarResultado();
        });
    }

    private void verificarDefinida(){
        if(!mascaras.estaDefinida()){
            throw new IllegalArgumentException("defina a máscara primeiro");
        }
    }
}
