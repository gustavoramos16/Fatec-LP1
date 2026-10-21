package exercicio6;

public class Viagem {
    //Entrada: distância da viagem e preço do combustível
    double distancia, precoCombustivel;
    final double CONSUMO = 12; //km por litro

    public Viagem(double distancia, double precoCombustivel){
        this.distancia = distancia;
        this.precoCombustivel = precoCombustivel;
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
    public String mostrarResultado(){
        double custo = calcularGasto();
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------\n");
        sb.append(String.format("Litros necessários: %.2f L%n", distancia / CONSUMO));
        if(distancia > 500){
            sb.append("Desconto de 5% aplicado (viagem acima de 500 km)\n");
        }
        sb.append(String.format("Gasto total: R$ %.2f%n", custo));
        return sb.toString();
    }
}
