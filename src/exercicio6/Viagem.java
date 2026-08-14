package exercicio6;

import java.util.Scanner;

public class Viagem {
    //Entrada: distância da viagem e preço do combustível
    double distancia, precoCombustivel;
    final double CONSUMO = 12; //km por litro
    Scanner sn = new Scanner(System.in);

    public void receberDados(){
        System.out.print("Distância da viagem (km): ");
        distancia = sn.nextDouble();
        System.out.print("Preço do combustível (R$/L): ");
        precoCombustivel = sn.nextDouble();
    }

    //Processamento: calcular o gasto (12 km/L)
    //Se a viagem tiver mais de 500 km => desconto de 5%
    public double calcularGasto(){
        double litros = distancia / CONSUMO;
        double custo = litros * precoCombustivel;
        if(distancia > 500){
            custo = custo - (custo * 0.05);
        }
        return custo;
    }

    //Saída: valor gasto na viagem
    public void mostrarResultado(){
        double custo = calcularGasto();
        System.out.println("-------------------------------");
        System.out.printf("Litros necessários: %.2f L%n", distancia / CONSUMO);
        if(distancia > 500){
            System.out.println("Desconto de 5% aplicado (viagem acima de 500 km)");
        }
        System.out.printf("Gasto total: R$ %.2f%n", custo);
    }
}
