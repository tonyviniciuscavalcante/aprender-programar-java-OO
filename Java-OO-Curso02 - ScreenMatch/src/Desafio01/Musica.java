package Desafio01;

/*3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
avaliar a música e calcular a média de avaliações.*/

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    void exibeFixaTecnica() {
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista da música: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    void avaliarMusica(double nota) {
        avaliacao += nota / 2;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return numAvaliacoes / avaliacao;
    }
}
