package ui;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.function.Supplier;

public final class Componentes {

    private Componentes(){}

    public static void calcular(TextArea resultado, Supplier<String> calculo){
        try {
            resultado.setText(calculo.get());
        } catch (IllegalArgumentException ex) {
            resultado.setText("Erro: " + ex.getMessage());
        }
    }

    public static String lerTexto(TextField campo, String nome){
        String texto = campo.getText().trim();
        if(texto.isEmpty()){
            throw new IllegalArgumentException("preencha o campo \"" + nome + "\"");
        }
        return texto;
    }

    public static int lerInt(TextField campo, String nome){
        try {
            return Integer.parseInt(campo.getText().trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("informe um número inteiro em \"" + nome + "\"");
        }
    }

    public static double lerDouble(TextField campo, String nome){
        try {
            return Double.parseDouble(campo.getText().trim().replace(',', '.'));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("informe um número válido em \"" + nome + "\"");
        }
    }
}
