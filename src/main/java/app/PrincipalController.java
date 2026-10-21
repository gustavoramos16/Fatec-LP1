package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.io.UncheckedIOException;

public class PrincipalController {

    private static final String[] TELAS = {
            "/exercicio1/multiplo.fxml",
            "/exercicio2/login.fxml",
            "/exercicio3/mercado.fxml",
            "/exercicio4/temperatura.fxml",
            "/exercicio5/camelos.fxml",
            "/exercicio6/viagem.fxml",
            "/exercicio7/aluguel.fxml",
            "/exercicio8/loja.fxml",
            "/exercicio9/meioambiente.fxml",
            "/exercicio10/mascaras.fxml"
    };

    @FXML private BorderPane raiz;
    @FXML private ListView<String> menu;

    @FXML
    private void initialize(){
        menu.getSelectionModel().selectedIndexProperty().addListener((obs, antigo, opcaoMenu) -> {
            if(opcaoMenu.intValue() >= 0){
                raiz.setCenter(carregarTela(TELAS[opcaoMenu.intValue()]));
            }
        });
    }

    private ScrollPane carregarTela(String caminho){
        try {
            Parent tela = FXMLLoader.load(getClass().getResource(caminho));
            ScrollPane rolagem = new ScrollPane(tela);
            rolagem.setFitToWidth(true);
            return rolagem;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
