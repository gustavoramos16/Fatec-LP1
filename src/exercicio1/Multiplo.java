package exercicio1;
import java.util.Scanner;

public class Multiplo {
    int numero1, numero2;
    Scanner sn = new Scanner(System.in);
    public void receberNumeros(){
        numero1 = sn.nextInt();
        numero2 = sn.nextInt();
    }
    //Verificar se o primeiro é multiplo do segundo
    public void calcularMultiplo(){
        if(numero2%numero1 == 0){
            System.out.print("é múltiplo");
        }else{
            System.out.print("não é multiplo");
        }
    }
    //Mostrar o resultado
}
