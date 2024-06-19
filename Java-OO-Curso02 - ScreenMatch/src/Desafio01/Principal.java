package Desafio01;

public class Principal {
    public static void main(String[] args) {
        Aluno novoAluno = new Aluno();
        novoAluno.nome = "Heloisa";
        novoAluno.idade = 24;

        novoAluno.exibeFixaTecnica();

        System.out.println("============================");

        Carro novoCarro = new Carro();
        novoCarro.modelo = "Uno";
        novoCarro.ano = 2012;
        novoCarro.cor = "Prata";

        novoCarro.exibeFixaTecnica();
        novoCarro.calculaIdadeCarro(2024);

        System.out.println("============================");

        Musica novaMusica = new Musica();
        novaMusica.titulo = "Californication";
        novaMusica.artista = "Red Hot Chili Peppers";
        novaMusica.anoLancamento = 1999;
        novaMusica.avaliacao = 10;
        novaMusica.numAvaliacoes = 1;

        novaMusica.exibeFixaTecnica();
        novaMusica.avaliarMusica(8.5);
        novaMusica.pegaMedia();

        System.out.println("============================");

        Calculadora novoCalculo = new Calculadora();
        novoCalculo.valorEmDobro(8.5);

        System.out.println("============================");

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.exibaMensagem();
    }
}
