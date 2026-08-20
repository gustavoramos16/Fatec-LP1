import exercicio1.Multiplo;
import exercicio2.login;
import exercicio3.Mercado;
import exercicio4.Temperatura;
import exercicio5.Camelos;
import exercicio6.Viagem;
import exercicio7.Aluguel;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String opcaoMenu;

        System.out.println("Seja bem vindo ao programa!");
        System.out.println("1-Verificação de Múltiplo\n" +
                "2-Sistema de Login Simplificado\n" +
                "3-Compra com desconto\n" +
                "4-Temperatura\n" +
                "5-Os trinta e cinco camelos\n" +
                "6-Calculadora de viagem\n" +
                "7-Aluguel de carro");
        System.out.println("Escolha uma opção do menu");

        Scanner scan = new Scanner(System.in);
        opcaoMenu = scan.next();

        switch(opcaoMenu){
            case "1": Multiplo multiplo = new Multiplo();
                multiplo.receberNumeros();
                multiplo.calcularMultiplo();
                return;
            case "2": login login = new login();
                login.compararSenhas();
                return;
            case "3": Mercado mercado = new Mercado();
                mercado.definirPreço();
                mercado.mostrarResultado();
                return;
            case "4": Temperatura temperatura = new Temperatura();
                temperatura.receberTemperaturas();
                temperatura.classificarCadaUma();
                temperatura.mostrarResultado();
                return;
            case "5":  Camelos camelos = new Camelos();
                camelos.receberDados();
                camelos.mostrarResultado();
                return;
            case "6": Viagem viagem = new Viagem();
                viagem.receberDados();
                viagem.mostrarResultado();
                return;
            case "7": Aluguel aluguel = new Aluguel();
                aluguel.receberDados();
                aluguel.mostrarResultado();
        }
    }
}
