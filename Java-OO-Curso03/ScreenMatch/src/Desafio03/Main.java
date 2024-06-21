package Desafio03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.*/
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");
        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }

        /*2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.*/
        /*3. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.*/
        Animal animal = new Cachorro();
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        /*4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o
        preço médio dos produtos.*/
        Produto produto1 = new Produto("Celular", 1950.85);
        Produto produto2 = new Produto("Fone", 399.50);
        Produto produto3 = new Produto("Capinha", 39.99);
        Produto produto4 = new Produto("Película", 80.49);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }
        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

        /*5. Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida,
        crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.*/
        Circulo circulo = new Circulo();
        circulo.raio = 5;
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        /*6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos.
        Utilize um loop para encontrar e imprimir a conta com o maior saldo.*/
        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
