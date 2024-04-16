package Continente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pais pais1 = new Pais(1000, 10000000, 10000,"Brasil");
        Pais pais2 = new Pais(2000, 20000000, 20000, "Argentina");

        Continente continente = new Continente("America");
        continente.addPais(pais1);
        continente.addPais(pais2);

        System.out.println("dimensão total: "+ continente.dimensaoTotal());
        System.out.println("População total do continente: "+ continente.populacaoTotal());
        System.out.println("Densidade total do continente: "+ continente.densidadeTotal());
        System.out.println("Pais com maior população: "+ continente.maiorPopulacao().getNome());
        System.out.println("Pais com menor população: "+ continente.menorPopulacao().getNome());
        System.out.println("Pais com maior dimensao: "+ continente.maiorDimensao().getNome());
        System.out.println("Pais com menor dimensao: "+ continente.menorDimensao().getNome());
        System.out.println("A razão territorial maior pais em relação ao menor país: "+ continente.razaoDimensao());

    }
}
