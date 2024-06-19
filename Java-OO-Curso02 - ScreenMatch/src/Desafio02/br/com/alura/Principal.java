package Desafio02.br.com.alura;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria novaConta = new ContaBancaria();
        novaConta.setNumeroConta(1111);
        novaConta.setSaldo(2500);
        System.out.println("O número da conta é: " + novaConta.getNumeroConta());
        System.out.println("O saldo da conta é: " + novaConta.getSaldo());

        System.out.println("===============================");

        idadePessoa novaPessoa = new idadePessoa();
        novaPessoa.setNome("Tony");
        novaPessoa.setIdade(24);
        System.out.println("A idade do " + novaPessoa.getNome() + " é " + novaPessoa.getIdade());

        System.out.println("===============================");

        Produto novoProduto = new Produto();
        novoProduto.setNome("Chococolate");
        novoProduto.setPreco(150);
        System.out.println("O " + novoProduto.getNome() + "custa R$" + novoProduto.getPreco());
        novoProduto.aplicarDesconto(0.1);
        System.out.println("O " + novoProduto.getNome() + " com desconto passa a custar R$" + novoProduto.getPreco());

        System.out.println("===============================");

        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());

        System.out.println("===============================");

        Livro novoLivro = new Livro();
        novoLivro.setAutor("Holmes");
        novoLivro.setTitulo("A volta dos que não foram");
        novoLivro.exibirDetalhes();
    }
}
