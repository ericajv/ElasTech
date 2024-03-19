package Atividade3LacoRepeticao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
//        1 -Crie um programa que realize uma contagem regressiva de 10 até 1,
//        mostrando cada número na tela.
//      ex1();
//        2 - Escreva um programa que solicite um número ao usuário
////        e exiba a tabuada desse número de 1 a 10.
//        ex2();
//        3 - Desenvolva um algoritmo que calcule a soma dos números pares
//        de 1 a 100
//        ex3();
//        4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.
//        ex4();
//        5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.
//        ex5();
//        6 - Faça um programa que solicite ao usuário números inteiros positivos.
//        Quando o usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.
//        ex6();
//        7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração, multiplicação e
//        divisão entre dois números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.
//        ex7();
//        8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar adivinhá-lo.
//        O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
//        ex8();
//        9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao usuário qual conversão deseja fazer.
//        O programa deve continuar executando até que o usuário decida sair.
//        ex9();
//        10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
//        O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
//        O programa deve continuar executando até que o usuário decida sair.
//        ex10();
    }
    private static void ex1() {
        for (int i = 10; i >=1; i--) {
            System.out.println("i = " + i);
        }
    }
    private static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            int tab = i * num;
            System.out.println("Tabuada de " + num + "= " + num + " * " + i + " = " + tab);
        }
    }
    private static void ex3() {
    int soma = 0;
        for(int i=1; i <=100; i++) {
             if((i%2)==0){
               soma = soma+i;
                System.out.println("i =" + i );
            }
        }
        System.out.println("soma: " + soma);
        }

    private static void ex4() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero a ser verificado");
       int num = scanner.nextInt();
       int divisor = 2;
      while (num%divisor!=0 && divisor<num-1){
          divisor++;
      }

      if(divisor == num-1 || (num <= 2  && num > 0)){
          System.out.println("O numero e primo");
      } else {
          System.out.println("O numero nao e primo");
      }

    }
    private static void ex5() {
        int primeiroNum = 0;
        int segundoNum = 1;

        int temporario;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

        System.out.print(primeiroNum + " ");

        for (int i = 1; i < 20; i++) {
            System.out.print(segundoNum + " ");

            temporario = primeiroNum + segundoNum;
            primeiroNum = segundoNum;
            segundoNum = temporario;
        }
    }

    private static void ex6() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("digite um numero");
      int number = scanner.nextInt();
      int soma = 0;
      int contador = 0;
      while (number >= 0 ){
          soma = soma + number;
          System.out.println("digite outro numero");
          number = scanner.nextInt();
           contador++;
      }
      int media = (soma/contador);
        System.out.println("soma: " + soma+ " e a media: " + media);
        }
    private static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##Calculadora## \n Digite 1 para calcular!");
        int calculadora = scanner.nextInt();

        while(calculadora == 1){

            System.out.println("digite o primeiro numero");
            int number01 = scanner.nextInt();
            System.out.println("digite o segundo numero");
            int number02 = scanner.nextInt();

            int soma = (number01+number02);
            int sub = (number01-number02);
            int div = (number01/number02);
            int mult = (number01*number02);

            System.out.println("soma: "+soma+ "\nsub: "+ sub+ "\ndiv: "+div+ "\nmulti: "+ mult );

            System.out.println("Digite 1 para continuar calculando, ou outro numero para sair!  ");
            calculadora = scanner.nextInt();
        }
            System.out.println("Você encerrou a calculadora");
    }
    
    private static void ex8() {
        Scanner leitura = new Scanner(System.in);

        Random random = new Random();
        int palpite = 0, numerodasorte = random.nextInt(100) + 1;

        System.out.println(" Vamos iniciar o jogo ");

        System.out.println(" Voce deve acertar o numero ");


        while (palpite != numerodasorte) {
            System.out.println("Digite um numero, vamos ver se voce acerta");
            palpite = leitura.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("Parabens voce acertou");
            } else {
                System.out.println("Tente novamente");

                if (palpite < numerodasorte) {
                    System.out.println(" tente um numero maior");
                } else {
                    System.out.println(" tente um numero menor");
                }
            }
        }
}
    private static void ex9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##Conversor## \n Digite 1 para converter!");
        int conversor = scanner.nextInt();

        while(conversor == 1){

            System.out.println("Digite 1 para: Celsius -> Fahrenheit \n Digite 2 para: Fahrenheit -> Celsius ");
            int opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Digite a temperatura em Celsius");
                double celsius = scanner.nextDouble();
                String resultado = String.format("%.2f", (celsius * 1.8)+32);
                System.out.println("O resultado de " + celsius + " em Fahrenheit e = "+ resultado+"ºF");

            } else if(opcao == 2){
                System.out.println("Digite a temperatura em Fahrenheit");
                double fahrenheit = scanner.nextDouble();
                String resultado = String.format("%.2f", (fahrenheit -32)/1.8);
                System.out.println("O resultado de " + fahrenheit + " em Fahrenheit e = "+ resultado+"ºC");
            }else {
                System.out.println("opção invalida, tente novamente!");
            }
            System.out.println("Digite 1 para continuar convertendo, ou outro numero para sair!  ");
            conversor = scanner.nextInt();

               }
        System.out.println("Você encerrou a conversor");
       }
    private static void ex10() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listadecompras = new ArrayList<>();

        System.out.println("Digite os itens da lista de compra ou digite 'sair' para finalizar a operacao");

        while (true) {
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("sair")) {
                break;
            }
            listadecompras.add(item);
            System.out.println("lista de compra: ");
            for (String i : listadecompras) {
                System.out.println(i);
            }
            System.out.println("Se desejar, digite mais item a sua lista de compras, ou digite sair para finalizar!");

        }
    }
}


