package Contador;

import Suprimentos.Suprimentos;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(2);
        System.out.println("o numero é: " + contador.getItem());
        contador.incrementar();
        System.out.println("o numero é: " + contador.getItem());
        contador.zerar();
        System.out.println("o numero é: " + contador.getItem());
        contador.incrementar();
        System.out.println("o numero é: " + contador.getItem());

    }
}
