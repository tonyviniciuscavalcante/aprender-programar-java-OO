package Desafios2;

public class Convercao {
    public static void main(String[] args) {

        double celsiusTemperatura = 30.5;
        double fahrenheitTemperatura = (celsiusTemperatura * 1.8) + 32;
        int fahrenheitTemperaturaInteira = (int) fahrenheitTemperatura;

        String descricao;
        descricao = """
                Está fazendo: %f graus celsius
                Convertendo para fahrenheit, está fazendo: %f graus fahrenheit
                E a temperatura aproximada em fahrenheité: %d graus fahrenheit
                """.formatted(celsiusTemperatura, fahrenheitTemperatura, fahrenheitTemperaturaInteira);

        System.out.println(descricao);
    }
}
