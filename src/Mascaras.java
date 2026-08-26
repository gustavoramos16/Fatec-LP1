import java.util.Objects;
import java.util.Scanner;

public class Mascaras {
    String boca;
    Olho olho;
    String nariz;

    public void DefinirConjuntoMascara() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a característica da boca");
        boca = scan.next();
        System.out.println("Digite a caracteristica do olho");
        olho.olho = scan.next();
        System.out.println("Digite o tipo do olho");
        olho.tipoOlho = scan.next();
        System.out.println("Digite a caracteristica do nariz");
        nariz = scan.next();
    }

    public void BuscarTipoDeOlhoPorMascara() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tipo de olho que deseja buscar");
        String tipo = scan.next();
        if(Objects.equals(olho.tipoOlho, tipo)){
            System.out.printf("Encontrado olho ", olho.olho);
        }else{
            System.out.println("Não encontrado nenhum olho");
        }
    }

    public void EditarConjuntoMascara(){
        Scanner scan = new Scanner(System.in);
        if(!boca.isEmpty()){
            System.out.println("Digite a característica da boca");
            boca = scan.next();
        }

        if(!nariz.isEmpty()){
            System.out.println("Digite a caracteristica do olho");
            olho.olho = scan.next();
        }

        if(!olho.olho.isEmpty()){
            System.out.println("Digite a caracteristica do nariz");
            nariz = scan.next();
        }
    }
}

class Olho{
    String olho;
    String tipoOlho;
    Olho(){

    }
}
