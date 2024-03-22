package Atividade4Encapsulamento.Suprimentos;

public class Main {
    public static void main(String[] args) {
        Suprimentos suprimentos = new Suprimentos(1, "descricao", 10, 27.55);
        System.out.println("id do suprimento: " + suprimentos.getId());
        System.out.println("descrição do item: "+ suprimentos.getDescricao());
        System.out.println("quantidade de itens: "+ suprimentos.getQuantidade());
        System.out.println("Preço do item: "+ suprimentos.getPreco());
        System.out.println("Valor total da fatura: " + suprimentos.getInvoiceAmount());
        suprimentos.setId(3);
        suprimentos.setDescricao("Descricao 2222222");
        suprimentos.setQuantidade(3);
        suprimentos.setPreco(31.55);
        System.out.println("id do suprimento: " + suprimentos.getId());
        System.out.println("descrição do item: "+ suprimentos.getDescricao());
        System.out.println("quantidade de itens: "+ suprimentos.getQuantidade());
        System.out.println("Preço do item: "+ suprimentos.getPreco());
        System.out.println("Valor total da fatura: " + suprimentos.getInvoiceAmount());
    }
}
