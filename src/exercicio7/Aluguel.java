package exercicio7;

import java.util.Scanner;

public class Aluguel {
    //Entrada: quantidade de dias e quilometragem percorrida
    int dias;
    double km;
    final double DIARIA = 100;        //diária fixa
    final double LIMITE_KM = 100;     //km livres por dia
    final double ADICIONAL_KM = 0.50; //cobrança por km acima do limite
    Scanner sn = new Scanner(System.in);

    public void receberDados(){
        System.out.print("Quantidade de dias: ");
        dias = sn.nextInt();
        System.out.print("Quilometragem percorrida (km): ");
        km = sn.nextDouble();
    }

    //Processamento: diária fixa + adicional por km acima do limite
    public double calcularPreco(){
        double custoDiarias = dias * DIARIA;
        double limite = dias * LIMITE_KM;
        double custoKm = 0;
        if(km > limite){
            custoKm = (km - limite) * ADICIONAL_KM;
        }
        return custoDiarias + custoKm;
    }

    //Saída: preço do aluguel
    public void mostrarResultado(){
        double limite = dias * LIMITE_KM;
        double kmExtra = km > limite ? km - limite : 0;
        System.out.println("-------------------------------");
        System.out.printf("Diárias: %d x R$ %.2f = R$ %.2f%n", dias, DIARIA, dias * DIARIA);
        System.out.printf("Km livres: %.0f | Km extra: %.0f%n", limite, kmExtra);
        System.out.printf("Adicional por km: R$ %.2f%n", kmExtra * ADICIONAL_KM);
        System.out.printf("Preço total do aluguel: R$ %.2f%n", calcularPreco());
    }
}
