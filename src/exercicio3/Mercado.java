package exercicio3;

import java.util.ArrayList;
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
    List<Item> itens = new ArrayList<>();

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
            System.out.printf("Digite o valor para %s: ", e.nome);
            e.valor = sn.nextDouble();
        });
    }

    //somar o preço de todos os itens
    public double calcularTotal(){
        double total = 0;
        for(Item e : itens){
            total += e.valor;
        }
        return total;
    }

    //verificar se o valor total é maior que 100
    //caso sim => aplique o desconto
    //caso não => aplique o valor original
    public boolean verificarValor(double total){
        return total > 100;
    }

    //mostrar listagem do caixa
    //item
    //quantidade
    //preço parcial
    //valor final a ser pago
    public void mostrarResultado(){
        double total = calcularTotal();
        double desconto = 0;
        if(verificarValor(total)){
            desconto = total * 0.10;
        }
        double valorFinal = total - desconto;

        System.out.println("------------------- CAIXA -------------------");
        System.out.printf("%-32s %-8s %-10s%n", "Item", "Qtd(g)", "Preço");
        for(Item e : itens){
            System.out.printf("%-32s %-8.0f R$ %.2f%n", e.nome, e.peso, e.valor);
        }
        System.out.println("---------------------------------------------");
        System.out.printf("Total.............: R$ %.2f%n", total);
        System.out.printf("Desconto (10%%)....: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar.....: R$ %.2f%n", valorFinal);
    }
}

class Item{
    String nome;
    double peso;
    double valor;

    Item(String nome, double peso, double... valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor.length > 0 ? valor[0] : 0;
    }
}
