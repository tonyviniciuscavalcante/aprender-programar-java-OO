package Desafio02.br.com.alura.modelos;

/*3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/

public class Produto {
    private String nome;
    private int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentoDesconto) {
        double desconto = preco * porcentoDesconto;
        preco -= desconto;
    }
}
