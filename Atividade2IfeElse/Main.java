import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//         1.
// Solicite o nome e a idade do usuário. Em seguida, exiba uma mensagem com essas informações.

//        Scanner scanner = new Scanner(System.in);
////usuario digita nome
//        System.out.println("Digite seu nome ");
//        String nome = scanner.nextLine();
//
////   usuario digita idade
//        System.out.println("Digite sua idade ");
//        int idade = scanner.nextInt();
//
////Imprime pro usuario
//       System.out.println("o seu nome e " + nome + " sua idade e " + idade );


//==================================================================================================

//          2.
// Peça dois números ao usuário e realize operações de adição, subtração, multiplicação e divisão. Exiba os resultados.
//      
//          Scanner numero = new Scanner(System.in);
//
////         Pede numero ao usuario
//        System.out.println("digite o primeiro numero");
//        int PrimeiroNum = numero.nextInt();
//        System.out.println("digite o segundo numero");
//        int SegundoNum = numero.nextInt();
//
////        Realizar as operações
//        int soma, subtracao , multiplicacao, divisao;
//
//        soma = PrimeiroNum + SegundoNum;
//        subtracao = PrimeiroNum - SegundoNum;
//        multiplicacao = PrimeiroNum * SegundoNum;
//        divisao = PrimeiroNum / SegundoNum;
//
////        printa o resultado
//
//        System.out.println("O resultado da soma: " + soma +" da subitracao: "+ subtracao + " da multiplicacao: " + multiplicacao +" da divisao: "+ divisao);
//
//=========================================================================================================
// //         3.
// Crie um programa que verifica se um número digitado pelo usuário é positivo, negativo ou zero. 

//        Scanner scanner = new Scanner(System.in);
////    Receber um numero do usuario
//        System.out.println("Digite um numero");
//        int numero = scanner.nextInt();
////        Verificar se e positivo
//        if(numero > 0){
//            System.out.println("O numero digitado e positivo");
//        }
////        Veficar se e negativo
//        if(numero < 0){
//            System.out.println("O numero digitado e negativo");
//        }
////        verficar se e zero
//        if(numero == 0){
//            System.out.printf("O numero digitado e zero!");
//        }
//==================================================================================================================
//          4.
// Solicite ao usuário um dia da semana (em formato numérico de 1 a 7) e exiba o nome correspondente usando um bloco switch.
//        Scanner menu = new Scanner(System.in);
//
////        Pede o numero pro usuario
//
//        System.out.println("Digite o numero");
//        int diadasemana = menu.nextInt();
//
////        verificar o numero que o usuario digitou
//
//        switch (diadasemana){
//            case 1:
//                System.out.printf("Segunda-feira");
//                break;
//            case 2:
//                System.out.printf("Terca-feira");
//                break;
//            case 3:
//                System.out.printf("Quarta-feira");
//                break;
//            case 4:
//            System.out.printf("Quinta-feira");
//                break;
//            case 5:
//                System.out.printf("Sexta-feira");
//                break;
//            case 6:
//                System.out.printf("Sabado");
//                break;
//            case 7:
//                System.out.printf("Domingo");
//                break;
//            default:
//                System.out.printf("Opção Invalida");
//
//        }
//=========================================================================================================
//  5.

// "Escreva um programa em Java que solicita ao usuário um número inteiro. Com base nesse número, o programa deve realizar as seguintes ações:

// 1. Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
// 2. Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
// 3. Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.

//      Scanner scanner = new Scanner(System.in);
//
////    recebe o numero que o usuario digitou
//
//        System.out.printf("Digite o numero");
//        int numero = scanner.nextInt();
//        int novonumero;
////Verifica se o numero e positivo ou negativo
//
//        if (numero >= 0){
//            novonumero = numero;
//            System.out.println("O numero é positivo");
//        } else {
//            novonumero = numero * -1;
//            System.out.println("O numeor é negativo");
//        }
//
////        Verifica se o numero é par ou impar utilizando o Switch case
//
//       int NumVerifica = novonumero % 2;
//
//        switch (NumVerifica){
//           case 1:
//               System.out.println("numero impar");
//                break;
//            case 0:
//               System.out.println("numero par");
//               break;
//               default:
//                    System.out.println("Opção Invalida");
//       }
//==================================================================================================================
//     6 -
// Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:

// 1. Solicitar ao usuário que insira o valor total de sua compra.
// 2. Com base nesse valor, aplicar descontos conforme as seguintes regras:
// Se o valor for maior que R$ 200, aplique um desconto de 10%.
// Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
// Caso contrário, não aplique desconto.
// 3. Exiba o valor final a ser pago pelo usuário após o desconto.
// Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:
// Opção 1: Cartão de crédito
// Opção 2: Boleto bancário
// Opção 3: Transferência bancária 

//        Scanner scanner = new Scanner(System.in);
////     Usuario digita valor total da compra
//
//        System.out.println("Digite o valor total da sua compra");
//        double compra = scanner.nextDouble();
//        double total = compra;
//
////        desconto de 10% para compras acima de 200
//
//        if(compra > 200){
//            total = compra - (compra * 0.10);
//            System.out.println("Você recebeu um desconto de 10%, valor a pagar é: " + total);
//        }
//        //        desconto de 5% para compras entre 100 e 200
//
//        else if(compra <= 200 && compra >= 100){
//            total = compra - (compra * 0.05);
//            System.out.println("Você recebeu um desconto de 5%, valor a pagar é: " + total);
//        }else {
//            System.out.println("O valor a pagar é: " + total);
//        }
////Cliente escolhe a forma de pagamento
//
//        System.out.printf("Digite a forma de pagamento: \n" +
//                "Opção 1: Cartão de crédito\n" +
//                "Opção 2: Boleto bancário\n" +
//                "Opção 3: Transferência bancária ");
//
//            int opcao = scanner.nextInt();
//
//            switch (opcao){
//                case 1:
//                    System.out.println("Pagamento com cartao de credito");
//                    break;
//                case 2:
//                    System.out.printf("Pagamento com boleto bancario");
//                    break;
//                case 3:
//                    System.out.printf("Pagamento por transferencia bancaria");
//                    break;
//                default:
//                    System.out.printf("Forma de pagamento invalida");
//            }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite sua idade");
//        System.out.println((scanner.nextInt() >= 18) ? "Voce é maior de idade" : "Voce é menor de idade");
 }
}