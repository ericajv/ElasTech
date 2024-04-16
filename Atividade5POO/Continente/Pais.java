package Continente;

public class Pais {
    private double dimensao;
    private long populacao;
    private double densidade;
    private String nome;

    public Pais(double dimensao, long populacao, double densidade, String nome){
        this.dimensao = dimensao;
        this.populacao = populacao;
        this.densidade = densidade;
        this.nome = nome;
    }
    public void setDimensao(double dimensao){
        this.dimensao = dimensao;
    }
    public double getDimensao(){
        return dimensao;
    }
    public void setPopulacao(long populacao){
        this.populacao=populacao;
    }
    public Long getPopulacao(){
        return populacao;
    }

    public void setDensidade(double densidade){
        this.densidade = densidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDensidade(){
       return densidade;
    }

}





























