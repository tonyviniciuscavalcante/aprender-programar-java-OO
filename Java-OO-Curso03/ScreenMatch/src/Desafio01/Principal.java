package Desafio01;

import java.util.ArrayList;

/*
1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
2. No método main da classe br.com.alura.screenmatch.principal.Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
3. Adicione pelo menos três pessoas à lista utilizando o método add.
4. Imprima o tamanho da lista utilizando o método size.
5. Imprima a primeira pessoa da lista utilizando o método get.
6. Imprima a lista completa
*/

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoaM = new Pessoa("Tony", 24);

        Pessoa pessoaF = new Pessoa("Heloisa", 25);

        Pessoa pessoaA = new Pessoa("Gabriela", 21);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoaM);
        listaDePessoas.add(pessoaF);
        listaDePessoas.add(pessoaA);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("A primeira pessoa é: " + listaDePessoas.get(0).getNome());

        System.out.println("== Lista de Pessoas ==");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
