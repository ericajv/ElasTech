package Atividade4Encapsulamento.Colaboradores;

public class Colaborador {

    private String primeironome;
    private String sobrenome;
    private double salarioMensal;

    public Colaborador(String primeironome, String sobrenome, double salarioMensal) {
        this.primeironome = primeironome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }
}
