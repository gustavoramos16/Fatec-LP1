package exercicio7;

public class Aluguel {
    //Entrada: quantidade de dias e quilometragem percorrida
    int dias;
    double km;
    final double DIARIA = 100;        //diária fixa
    final double LIMITE_KM = 100;     //km livres por dia
    final double ADICIONAL_KM = 0.50; //cobrança por km acima do limite

    public Aluguel(int dias, double km){
        this.dias = dias;
        this.km = km;
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
    public String mostrarResultado(){
        double limite = dias * LIMITE_KM;
        double kmExtra = km > limite ? km - limite : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------\n");
        sb.append(String.format("Diárias: %d x R$ %.2f = R$ %.2f%n", dias, DIARIA, dias * DIARIA));
        sb.append(String.format("Km livres: %.0f | Km extra: %.0f%n", limite, kmExtra));
        sb.append(String.format("Adicional por km: R$ %.2f%n", kmExtra * ADICIONAL_KM));
        sb.append(String.format("Preço total do aluguel: R$ %.2f%n", calcularPreco()));
        return sb.toString();
    }
}
