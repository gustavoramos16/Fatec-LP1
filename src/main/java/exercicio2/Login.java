package exercicio2;

import java.util.Objects;

public class Login {
    //Definir senha padrão
    String senha = "1234";

    //Fazer comparação entre as senhas
    //Mostrar resultado da comparação
    public String compararSenhas(String novaSenha){
        if(Objects.equals(novaSenha, senha)){
            return "Senha correta";
        }else{
            return "Senha incorreta";
        }
    }
}
