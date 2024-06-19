package Desafio03.br.com.alura.modelos.exercicio02;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}
