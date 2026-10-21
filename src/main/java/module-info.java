module fatec.lp1 {
    requires javafx.controls;
    requires javafx.fxml;

    exports app;

    opens app to javafx.fxml;
    opens exercicio1 to javafx.fxml;
    opens exercicio2 to javafx.fxml;
    opens exercicio3 to javafx.fxml;
    opens exercicio4 to javafx.fxml;
    opens exercicio5 to javafx.fxml;
    opens exercicio6 to javafx.fxml;
    opens exercicio7 to javafx.fxml;
}
