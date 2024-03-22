package Atividade4Encapsulamento.Suprimentos;

public class Suprimentos {
    private int id;
    private String descricao;
    private int quantidade;
    private double preco;

    public Suprimentos(int id, String descricao, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.preco = preco < 0 ? preco : 0.0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco > 0 ? preco : 0.0;
    }

    public double getInvoiceAmount () {
        return this.quantidade * this.preco;
    }
}
