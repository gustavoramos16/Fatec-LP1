package exercicio10;

import java.util.Objects;

public class Mascaras {
    String boca;
    Olho olho = new Olho();
    String nariz;

    public void definirConjuntoMascara(String boca, String olho, String tipoOlho, String nariz) {
        this.boca = boca;
        this.olho.olho = olho;
        this.olho.tipoOlho = tipoOlho;
        this.nariz = nariz;
    }

    public boolean estaDefinida(){
        return boca != null;
    }

    public String buscarTipoDeOlhoPorMascara(String tipo) {
        if(Objects.equals(olho.tipoOlho, tipo)){
            return "Encontrado olho " + olho.olho;
        }else{
            return "Não encontrado nenhum olho";
        }
    }

    //Campos em branco mantêm o valor atual
    public void editarConjuntoMascara(String boca, String olho, String nariz){
        if(!boca.isEmpty()){
            this.boca = boca;
        }

        if(!olho.isEmpty()){
            this.olho.olho = olho;
        }

        if(!nariz.isEmpty()){
            this.nariz = nariz;
        }
    }

    public String mostrarResultado(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Boca: %s%n", boca));
        sb.append(String.format("Olho: %s (tipo: %s)%n", olho.olho, olho.tipoOlho));
        sb.append(String.format("Nariz: %s%n", nariz));
        return sb.toString();
    }
}

class Olho{
    String olho;
    String tipoOlho;
    Olho(){

    }
}
