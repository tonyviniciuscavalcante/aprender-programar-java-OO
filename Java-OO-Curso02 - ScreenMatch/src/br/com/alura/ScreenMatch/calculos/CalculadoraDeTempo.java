package br.com.alura.ScreenMatch.calculos;

import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;
import br.com.alura.ScreenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    //private int tempoTotal = 0; -> da maneira explícita, não obrigatório pois não está am ambíguo
    private int tempoTotal;

    public int getTempoTotal() {
        //return this.tempoTotal; -> da maneira explícita, não obrigatório pois não está am ambíguo
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        //this.tempoTotal += f.getDucaraoEmMinutos(); -> da maneira explícita, não obrigatório pois não está am ambíguo
//        tempoTotal += f.getDucaraoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        //this.tempoTotal += s.getDucaraoEmMinutos(); -> da maneira explícita, não obrigatório pois não está am ambíguo
//        tempoTotal += s.getDucaraoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        //System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDucaraoEmMinutos();
    }
}
