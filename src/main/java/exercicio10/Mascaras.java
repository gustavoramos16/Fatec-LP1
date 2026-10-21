package exercicio10;

import java.util.Objects;

public class Mascaras {
    Boca boca = new Boca();
    Olho olho = new Olho();
    Nariz nariz = new Nariz();

    public boolean estaDefinida(){
        return boca.caracteristica != null;
    }

    public void limparMascara(){
        boca = new Boca();
        olho = new Olho();
        nariz = new Nariz();
    }

    public String mostrarResultado(){
        StringBuilder sb = new StringBuilder();
        sb.append(boca.mostrarDados());
        sb.append(olho.mostrarDados());
        sb.append(nariz.mostrarDados());
        return sb.toString();
    }
}

class Boca{
    String caracteristica;
    String cor;
    String tamanho;

    public void definirBoca(String caracteristica, String cor, String tamanho){
        this.caracteristica = caracteristica;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    //Campo em branco mantém o valor atual
    public void editarBoca(String caracteristica){
        if(!caracteristica.isEmpty()){
            this.caracteristica = caracteristica;
        }
    }

    public String mostrarDados(){
        return String.format("Boca: %s, cor %s, tamanho %s%n", caracteristica, cor, tamanho);
    }
}

class Olho{
    String olho;
    String tipoOlho;
    String cor;

    public void definirOlho(String olho, String tipoOlho, String cor){
        this.olho = olho;
        this.tipoOlho = tipoOlho;
        this.cor = cor;
    }

    public String buscarTipoDeOlhoPorMascara(String tipo){
        if(Objects.equals(tipoOlho, tipo)){
            return "Encontrado olho " + olho;
        }else{
            return "Não encontrado nenhum olho";
        }
    }

    //Campo em branco mantém o valor atual
    public void editarOlho(String olho){
        if(!olho.isEmpty()){
            this.olho = olho;
        }
    }

    public String mostrarDados(){
        return String.format("Olho: %s (tipo: %s), cor %s%n", olho, tipoOlho, cor);
    }
}

class Nariz{
    String caracteristica;
    String formato;
    String tamanho;

    public void definirNariz(String caracteristica, String formato, String tamanho){
        this.caracteristica = caracteristica;
        this.formato = formato;
        this.tamanho = tamanho;
    }

    //Campo em branco mantém o valor atual
    public void editarNariz(String caracteristica){
        if(!caracteristica.isEmpty()){
            this.caracteristica = caracteristica;
        }
    }

    public String mostrarDados(){
        return String.format("Nariz: %s, formato %s, tamanho %s%n", caracteristica, formato, tamanho);
    }
}
