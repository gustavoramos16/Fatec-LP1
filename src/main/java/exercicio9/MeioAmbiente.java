package exercicio9;

public class MeioAmbiente {
    String arvore;
    int folhas;
    String terra;

    public void definirNomeDaArvore(String arvore){
        this.arvore = arvore;
    }

    public void definirQuantidadeDeFolhasPorArvore(int folhas){
        this.folhas = folhas;
    }

    public void definirTipoDeSolo(String terra){
        this.terra = terra;
    }

    public String mostrarResultado(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Árvore: %s%n", arvore));
        sb.append(String.format("Quantidade de folhas: %d%n", folhas));
        sb.append(String.format("Tipo de solo: %s%n", terra));
        return sb.toString();
    }
}
