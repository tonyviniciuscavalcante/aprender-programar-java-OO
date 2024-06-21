package Desafio02;

public class ProdutoPerecivel extends Produto{
    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        String retorno;
        retorno = """
                =================================================
                O produto %s é perecível, com data de validade %s
                Está custando R$%f
                E temos %d quantidades em estoque.
                =================================================
                """.formatted(nome, dataValidade, preco, quantidade);

        return retorno;
    }
}
