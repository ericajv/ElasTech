package Continente;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;

    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public void addPais(Pais pais) {
        this.paises.add(pais);
    }

    public double dimensaoTotal() {
        double total = 0;
        for (int i = 0; i < this.paises.size(); i++) {
            total += this.paises.get(i).getDimensao();
        }
        return total;
    }

    public long populacaoTotal() {
        long total = 0;
        for (int i = 0; i < this.paises.size(); i++) {
            total += this.paises.get(i).getPopulacao();
        }
        return total;
    }

    public double densidadeTotal() {
        double total = 0;
        for (int i = 0; i < this.paises.size(); i++) {
            total += this.paises.get(i).getDensidade();
        }
        return total;
    }

    public Pais maiorPopulacao() {
        Pais maiorPopulacao = this.paises.getFirst();
        for (int i = 1; i < this.paises.size(); i++) {
            if (this.paises.get(i).getPopulacao() > maiorPopulacao.getPopulacao()) {
                maiorPopulacao = this.paises.get(i);
            }
        }
        return maiorPopulacao;
    }

    public Pais menorPopulacao() {
        Pais menorPopulacao = this.paises.getFirst();
        for (int i = 1; i < this.paises.size(); i++) {
            if (this.paises.get(i).getPopulacao() < menorPopulacao.getPopulacao()) {
                menorPopulacao = this.paises.get(i);
            }
        }
        return menorPopulacao;
    }

    public Pais maiorDimensao(){
        Pais maiorDimensao = this.paises.getFirst();
        for (int i = 1; i < this.paises.size(); i++) {
            if(this.paises.get(i).getDimensao() > maiorDimensao.getDimensao()){
                maiorDimensao = this.paises.get(i);
            }
        }
        return maiorDimensao;
    }
    public Pais menorDimensao(){
        Pais menorDimensao = this.paises.getFirst();
        for (int i = 1; i < this.paises.size(); i++) {
            if(this.paises.get(i).getDimensao() < menorDimensao.getDimensao()){
                menorDimensao = this.paises.get(i);
            }
        }
        return menorDimensao;
    }
    public double razaoDimensao(){
       return (this.maiorDimensao().getDimensao()/this.menorDimensao().getDimensao());
    }
}