package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Camelos {
    //Entrada: quantidade de camelos e as parcelas de divisão (denominadores)
    int camelos;
    List<Integer> parcelas = new ArrayList<>();
    Scanner sn = new Scanner(System.in);

    public void receberDados(){
        System.out.print("Quantidade de camelos da herança: ");
        camelos = sn.nextInt();

        System.out.print("Quantas pessoas vão dividir? ");
        int pessoas = sn.nextInt();
        for(int i = 0; i < pessoas; i++){
            System.out.printf("A pessoa %d recebe 1/? dos camelos: ", i + 1);
            parcelas.add(sn.nextInt());
        }
    }

    //Processamento: junta 1 camelo emprestado e divide pelas parcelas
    //Saída: quantidade de camelos para cada pessoa
    public void mostrarResultado(){
        //Beremiz junta o próprio camelo à herança
        int total = camelos + 1;
        int somaEntregue = 0;

        System.out.println("-------------------------------");
        System.out.printf("Total usado na divisão: %d camelos%n", total);
        for(int i = 0; i < parcelas.size(); i++){
            int parte = total / parcelas.get(i);
            somaEntregue += parte;
            System.out.printf("Pessoa %d (1/%d): %d camelos%n", i + 1, parcelas.get(i), parte);
        }

        //Sobra: 1 camelo volta para Beremiz e o resto é o pagamento dele
        int sobra = total - somaEntregue;
        System.out.println("-------------------------------");
        System.out.printf("Camelos distribuídos: %d%n", somaEntregue);
        System.out.printf("Sobra: %d camelos (1 devolvido + %d de pagamento)%n", sobra, sobra - 1);
    }
}
