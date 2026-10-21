package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Camelos {
    //Entrada: quantidade de camelos e as parcelas de divisão (denominadores)
    int camelos;
    List<Integer> parcelas = new ArrayList<>();

    public Camelos(int camelos, List<Integer> parcelas){
        this.camelos = camelos;
        this.parcelas.addAll(parcelas);
    }

    //Processamento: junta 1 camelo emprestado e divide pelas parcelas
    //Saída: quantidade de camelos para cada pessoa
    public String mostrarResultado(){
        //Beremiz junta o próprio camelo à herança
        int total = camelos + 1;
        int somaEntregue = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------\n");
        sb.append(String.format("Total usado na divisão: %d camelos%n", total));
        for(int i = 0; i < parcelas.size(); i++){
            int parte = total / parcelas.get(i);
            somaEntregue += parte;
            sb.append(String.format("Pessoa %d (1/%d): %d camelos%n", i + 1, parcelas.get(i), parte));
        }

        //Sobra: 1 camelo volta para Beremiz e o resto é o pagamento dele
        int sobra = total - somaEntregue;
        sb.append("-------------------------------\n");
        sb.append(String.format("Camelos distribuídos: %d%n", somaEntregue));
        sb.append(String.format("Sobra: %d camelos (1 devolvido + %d de pagamento)%n", sobra, sobra - 1));
        return sb.toString();
    }
}
