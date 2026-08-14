package exercicio3;

import java.util.List;
import java.util.Scanner;

public class Mercado {
    //Ler
    //Arroz
    //Feijão
    //Oléo de soja
    //Açucar
    //Café torrado e moído
    //Macarrão
    //Farinha de mandioca
    //Fubá de milho
    //Molho ou extrato de tomate
    //Sal refinado
    List<Item> itens;

    public void definirItens(){
        itens.add(new Item("Arroz", 1500));
        itens.add(new Item("Feijão", 1000));
        itens.add(new Item("Oléo de soja", 900));
        itens.add(new Item("Açúcar", 1000));
        itens.add(new Item("Café torrado e moído", 250));
        itens.add(new Item("Macarrão", 500));
        itens.add(new Item("Farinha de mandioca ou trigo", 1000));
        itens.add(new Item("Fubá de milho", 500));
        itens.add(new Item("Molho ou extrato de tomate", 300));
        itens.add(new Item("Sal refinado", 1000));
    }

    //ler o valor da compra

    public void definirPreço(){
        definirItens();
        Scanner sn = new Scanner(System.in);
        itens.forEach(e -> {
            System.out.printf("Digite o valor para ", e.nome);
            e.valor = sn.nextDouble();
        });
    }

    //verificar se o valor total é maior que 100
    //caso sim => aplique o desconto
    //caso não => aplique o valor original
    public boolean verificarValor(){
        return true;
    }

    //mostrar listagem do caixa
    //item
    //quantidade
    //preço parcial
    //valor final a ser pago
    public void mostrarResultado(){

    }
}

class Item{
    String nome;
    double peso;
    double valor;

    Item(String nome, double peso, double... valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor != null ? valor[0] : 0;
    }
}
