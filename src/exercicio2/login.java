package exercicio2;

import java.util.Objects;
import java.util.Scanner;

public class login {
    //Definir senha padrão
    String senha = "1234";
    String novaSenha;
    //Fazer comparação entre as senhas
    //Mostrar resultado da comparação
    public void compararSenhas(){
        Scanner sn = new Scanner(System.in);
        novaSenha = sn.next();
        if(Objects.equals(novaSenha, senha)){
            System.out.print("Senha correta");
        }else{
            System.out.print("Senha incorreta");
        }
    }
}
