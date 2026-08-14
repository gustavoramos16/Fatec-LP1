package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    //Ler a quantidade de registros
    //Ler cada temperatura em graus Celsius
    List<Double> temperaturas = new ArrayList<>();
    Scanner sn = new Scanner(System.in);

    public void receberTemperaturas(){
        System.out.print("Quantas temperaturas deseja informar? ");
        int quantidade = sn.nextInt();
        for(int i = 0; i < quantidade; i++){
            System.out.printf("Temperatura %d (°C): ", i + 1);
            temperaturas.add(sn.nextDouble());
        }
    }

    //Se estiver abaixo de 18°C => "Frio"
    //Caso contrário => "Temperatura agradável"
    public void classificarCadaUma(){
        temperaturas.forEach(t -> {
            if(t < 18){
                System.out.printf("%.1f °C -> Frio%n", t);
            }else{
                System.out.printf("%.1f °C -> Temperatura agradável%n", t);
            }
        });
    }

    //Determinar se em geral a cidade é agradável ou faz frio
    public void mostrarResultado(){
        int frios = 0;
        int agradaveis = 0;
        for(Double t : temperaturas){
            if(t < 18){
                frios++;
            }else{
                agradaveis++;
            }
        }
        System.out.println("-------------------------------");
        if(frios > agradaveis){
            System.out.println("Em geral, em São José dos Campos faz frio");
        }else{
            System.out.println("Em geral, em São José dos Campos a temperatura é agradável");
        }
    }
}
