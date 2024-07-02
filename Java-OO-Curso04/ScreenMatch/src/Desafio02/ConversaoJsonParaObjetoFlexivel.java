package Desafio02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*2. Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos
estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação
da biblioteca Gson para flexibilizar a conversão.*/

public class ConversaoJsonParaObjetoFlexivel {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
