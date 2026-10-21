package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Temperatura {
    //Ler a quantidade de registros
    //Ler cada temperatura em graus Celsius
    List<Double> temperaturas = new ArrayList<>();

    public void receberTemperatura(double temperatura){
        temperaturas.add(temperatura);
    }

    //Se estiver abaixo de 18°C => "Frio"
    //Caso contrário => "Temperatura agradável"
    public String classificarCadaUma(){
        StringBuilder sb = new StringBuilder();
        temperaturas.forEach(t -> {
            if(t < 18){
                sb.append(String.format("%.1f °C -> Frio%n", t));
            }else{
                sb.append(String.format("%.1f °C -> Temperatura agradável%n", t));
            }
        });
        return sb.toString();
    }

    //Determinar se em geral a cidade é agradável ou faz frio
    public String mostrarResultado(){
        int frios = 0;
        int agradaveis = 0;
        for(Double t : temperaturas){
            if(t < 18){
                frios++;
            }else{
                agradaveis++;
            }
        }
        StringBuilder sb = new StringBuilder(classificarCadaUma());
        sb.append("-------------------------------\n");
        if(frios > agradaveis){
            sb.append("Em geral, em São José dos Campos faz frio");
        }else{
            sb.append("Em geral, em São José dos Campos a temperatura é agradável");
        }
        return sb.toString();
    }
}
