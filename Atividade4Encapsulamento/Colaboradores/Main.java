package Atividade4Encapsulamento.Colaboradores;

public class Main {

    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("Erica", "Vieira", 1000.00);
        System.out.println("Nome do colaborador: " + colaborador1.getPrimeironome());
        System.out.println("Sobrenome do colaborador: " + colaborador1.getSobrenome());
        System.out.println("Salario mensal do colaborador: " + colaborador1.getSalarioMensal());
        System.out.println("Salario anual do colaborador: " + colaborador1.getSalarioMensal() * 12);

        double salario = colaborador1.getSalarioMensal();
        double salarioComAumento = salario * 1.1;
        colaborador1.setSalarioMensal(salarioComAumento);
        System.out.println("Salario mensal do colaborador: " + colaborador1.getSalarioMensal());
        System.out.println("Salario anual do colaborador: " + colaborador1.getSalarioMensal() * 12);

        Colaborador colaborador2 = new Colaborador("Edna", "Januario", 200.00);
        System.out.println("Nome do colaborador 2 : " + colaborador2.getPrimeironome());
        System.out.println("Sobrenome do colaborador 2: " + colaborador2.getSobrenome());
        System.out.println("Salario mensal do colaborador 2: " + colaborador2.getSalarioMensal());
        System.out.println("Salario anual do colaborador 2: " + colaborador2.getSalarioMensal() * 12);

        double salario2 = colaborador2.getSalarioMensal();
        double salarioComAumento2 = salario2 * 1.1;
        colaborador2.setSalarioMensal(salarioComAumento2);
        System.out.println("Salario mensal do colaborador 2: " + colaborador2.getSalarioMensal());
        System.out.println("Salario anual do colaborador 2:  " + colaborador2.getSalarioMensal() * 12);

    }
}

