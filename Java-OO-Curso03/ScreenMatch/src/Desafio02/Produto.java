package Desafio02;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String retorno;
        retorno = """
                ==================================
                O produto %s
                Está custando R$%f
                E temos %d quantidades em estoque.
                ==================================
                """.formatted(nome, preco, quantidade);
        return retorno;
    }
}
