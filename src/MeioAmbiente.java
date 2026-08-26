import java.util.Scanner;

public class MeioAmbiente {
    String arvore;
    int folhas;
    String terra;

    public void DefinirNomeDaArvore(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da árvore");
        arvore = scan.next();
    }

    public void DefinirQuantidadeDeFolhasPorArvore(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite a quantidade de folhas da árvore ", arvore);
        folhas = scan.nextInt();
    }

    public void DefinirTipoDeSolo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de solo");
        terra = scan.next();
    }
}
