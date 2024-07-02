package Desafio02;

import com.google.gson.Gson;

/*1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando
uma pessoa em um objeto do tipo Pessoa.*/

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}