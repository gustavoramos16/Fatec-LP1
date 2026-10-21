package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent raiz = FXMLLoader.load(getClass().getResource("principal.fxml"));

        Scene cena = new Scene(raiz, 1000, 650);
        stage.setTitle("Fatec LP1 - Exercícios");
        stage.setScene(cena);
        stage.show();
    }
}
