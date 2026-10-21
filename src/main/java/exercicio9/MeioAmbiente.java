package exercicio9;

public class MeioAmbiente {
    Arvore arvore = new Arvore();
    Folha folhas = new Folha();
    Terra terra = new Terra();

    public double calcularFolhasPorMetro(){
        if(arvore.altura <= 0){
            return 0;
        }
        return folhas.quantidade / arvore.altura;
    }

    public String verificarCondicaoDoSolo(){
        return String.format("Solo %s e %s", terra.classificarSolo(), terra.classificarUmidade());
    }

    public String mostrarResultado(){
        StringBuilder sb = new StringBuilder();
        sb.append(arvore.mostrarDados());
        sb.append(folhas.mostrarDados());
        sb.append(terra.mostrarDados());
        sb.append("-------------------------------\n");
        sb.append(String.format("Folhas por metro de altura: %.1f%n", calcularFolhasPorMetro()));
        sb.append(String.format("Condição do solo: %s%n", verificarCondicaoDoSolo()));
        return sb.toString();
    }
}

class Arvore{
    String nome;
    double altura;
    int idade;

    public void definirNomeDaArvore(String nome){
        this.nome = nome;
    }

    public void definirMedidas(double altura, int idade){
        this.altura = altura;
        this.idade = idade;
    }

    //Até 5 m => pequeno, até 15 m => médio, acima => grande
    public String classificarPorte(){
        if(altura <= 5){
            return "pequeno";
        }else if(altura <= 15){
            return "médio";
        }else{
            return "grande";
        }
    }

    public String mostrarDados(){
        return String.format("Árvore: %s - %.1f m, %d anos (porte %s)%n", nome, altura, idade, classificarPorte());
    }
}

class Folha{
    int quantidade;
    String cor;
    String formato;

    public void definirQuantidadeDeFolhasPorArvore(int quantidade){
        this.quantidade = quantidade;
    }

    public void definirCaracteristicas(String cor, String formato){
        this.cor = cor;
        this.formato = formato;
    }

    public String mostrarDados(){
        return String.format("Folhas: %d, cor %s, formato %s%n", quantidade, cor, formato);
    }
}

class Terra{
    String tipo;
    double ph;
    double umidade;

    public void definirTipoDeSolo(String tipo){
        this.tipo = tipo;
    }

    public void definirPhEUmidade(double ph, double umidade){
        this.ph = ph;
        this.umidade = umidade;
    }

    //pH abaixo de 6,5 => ácido, até 7,5 => neutro, acima => alcalino
    public String classificarSolo(){
        if(ph < 6.5){
            return "ácido";
        }else if(ph <= 7.5){
            return "neutro";
        }else{
            return "alcalino";
        }
    }

    //Umidade abaixo de 30% => seco, até 70% => úmido, acima => encharcado
    public String classificarUmidade(){
        if(umidade < 30){
            return "seco";
        }else if(umidade <= 70){
            return "úmido";
        }else{
            return "encharcado";
        }
    }

    public String mostrarDados(){
        return String.format("Solo: %s - pH %.1f, umidade %.0f%%%n", tipo, ph, umidade);
    }
}
