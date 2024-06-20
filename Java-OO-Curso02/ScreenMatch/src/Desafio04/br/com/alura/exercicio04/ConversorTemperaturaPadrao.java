package Desafio04.br.com.alura.exercicio04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double tempCelsius) {
        double temperatura = tempCelsius * 1.8 + 32;
        System.out.println("A temperatura dada em " + tempCelsius + "°C em Fahrenheit é: " + temperatura + "°F");
        return temperatura;
    }

    @Override
    public double fahrenheitParaCelsius(double tempFahrenheit) {
        double temperatura = (tempFahrenheit - 32) / 1.8;
        System.out.println("A temperatura dada em " + tempFahrenheit + "°F  em Celsius é: " + temperatura + "°C");
        return 0;
    }
}
