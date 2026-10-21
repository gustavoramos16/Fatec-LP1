package exercicio1;

public class Multiplo {
    int numero1, numero2;

    public Multiplo(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Verificar se o primeiro é multiplo do segundo
    public boolean calcularMultiplo(){
        return numero2 % numero1 == 0;
    }

    //Mostrar o resultado
    public String mostrarResultado(){
        if(numero1 == 0){
            return "Não é possível verificar: o primeiro número não pode ser zero";
        }
        if(calcularMultiplo()){
            return numero2 + " é múltiplo de " + numero1;
        }else{
            return numero2 + " não é múltiplo de " + numero1;
        }
    }
}
