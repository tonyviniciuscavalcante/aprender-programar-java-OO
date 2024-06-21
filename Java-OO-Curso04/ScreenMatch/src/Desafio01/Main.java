package Desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*1. Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books.
        Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.*/

        Scanner leitura1 = new Scanner(System.in);
        System.out.print("Digite o título do livro que deseja buscar: ");
        var busca1 = leitura1.nextLine().replace(" ", "+");;

        String endereco1 = "https://www.googleapis.com/books/v1/volumes?q=" + busca1;

        HttpClient client1 = HttpClient.newHttpClient();
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create(endereco1))
                .build();
        HttpResponse<String> response1 = client1
                .send(request1, HttpResponse.BodyHandlers.ofString());
        System.out.println(response1.body());

        /*2. Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma
        criptomoeda escolhida pelo usuário.*/

        Scanner leitura2 = new Scanner(System.in);
        System.out.print("Digite a moeda que deseja saber a cotação atual: ");
        var busca2 = leitura2.nextLine().trim().toLowerCase();

        String endereco2 = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca2 + "&vs_currencies=usd";

        HttpClient client2 = HttpClient.newHttpClient();
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create(endereco2))
                .build();
        HttpResponse<String> response2 = client2
                .send(request2, HttpResponse.BodyHandlers.ofString());
        System.out.println(response2.body());

        /*3. Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest e HttpResponse.
        Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.*/

        Scanner leitura3 = new Scanner(System.in);
        System.out.print("Digite o nome de uma receita: ");
        var busca3 = leitura3.nextLine().trim().replace(" ", "_");

        String endereco3 = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca3;

        HttpClient client3 = HttpClient.newHttpClient();
        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create(endereco3))
                .build();
        HttpResponse<String> response3 = client3
                .send(request3, HttpResponse.BodyHandlers.ofString());
        System.out.println(response3.body());
    }
}
