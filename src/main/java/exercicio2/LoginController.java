package exercicio2;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import ui.Componentes;

public class LoginController {

    @FXML private PasswordField txtSenha;
    @FXML private TextArea resultado;

    private final Login login = new Login();

    @FXML
    private void calcular(){
        Componentes.calcular(resultado, () -> login.compararSenhas(txtSenha.getText()));
    }
}
