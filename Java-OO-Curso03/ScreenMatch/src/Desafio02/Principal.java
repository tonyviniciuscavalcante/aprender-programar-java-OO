package Desafio02;

/*
1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

2. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
Em seguida, imprima a lista de produtos utilizando o método System.out.println().

3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
Em seguida, crie objetos Produto utilizando esse novo construtor.

4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super)
para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
*/

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Relógio", 50.99, 5);
        Produto produto2 = new Produto("Celular", 1950.99, 10);
        Produto produto3 = new Produto("Fone de ouvido", 298.99, 30);
        ProdutoPerecivel produto4 = new ProdutoPerecivel("Leite", 2.99, 3, "25/06/2024");

        ArrayList<Produto> produto = new ArrayList<>();
        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        produto.add(produto4);
        System.out.println("O tamanho da lista de produtos é: " + produto.size());
        System.out.println("O segundo produto da lista é: " + produto.get(1).getNome());
        System.out.println("==================================");
        System.out.println(produto.get(0).toString());
        System.out.println(produto.get(1).toString());
        System.out.println(produto.get(2).toString());
        System.out.println(produto.get(3).toString());

    }
}
