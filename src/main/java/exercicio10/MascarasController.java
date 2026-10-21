package exercicio10;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ui.Componentes;

public class MascarasController {

    @FXML private TextField txtBoca;
    @FXML private TextField txtOlho;
    @FXML private TextField txtTipoOlho;
    @FXML private TextField txtNariz;
    @FXML private TextField txtBuscarTipo;
    @FXML private TextField txtEditarBoca;
    @FXML private TextField txtEditarOlho;
    @FXML private TextField txtEditarNariz;
    @FXML private TextArea resultado;

    private final Mascaras mascaras = new Mascaras();

    @FXML
    private void definir(){
        Componentes.calcular(resultado, () -> {
            mascaras.definirConjuntoMascara(
                    Componentes.lerTexto(txtBoca, "Boca"),
                    Componentes.lerTexto(txtOlho, "Olho"),
                    Componentes.lerTexto(txtTipoOlho, "Tipo do olho"),
                    Componentes.lerTexto(txtNariz, "Nariz"));
            return "Máscara definida\n" + mascaras.mostrarResultado();
        });
    }

    @FXML
    private void buscar(){
        Componentes.calcular(resultado, () -> {
            verificarDefinida();
            return mascaras.buscarTipoDeOlhoPorMascara(Componentes.lerTexto(txtBuscarTipo, "Tipo de olho"));
        });
    }

    @FXML
    private void editar(){
        Componentes.calcular(resultado, () -> {
            verificarDefinida();
            mascaras.editarConjuntoMascara(txtEditarBoca.getText().trim(),
                    txtEditarOlho.getText().trim(), txtEditarNariz.getText().trim());
            return "Máscara editada\n" + mascaras.mostrarResultado();
        });
    }

    private void verificarDefinida(){
        if(!mascaras.estaDefinida()){
            throw new IllegalArgumentException("defina a máscara primeiro");
        }
    }
}
