import java.util.Scanner;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void setNotas(double[] notas, String matricula) {
        this.notas = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            this.notas[i] = notas[i];
        }
        this.matricula = matricula;
    }

    public double getMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println();
        System.out.println("Idade: " + idade);
        System.out.println();
        System.out.println("Matrícula: " + matricula);
        System.out.println();
        System.out.println("Média: " + getMedia());
        System.out.println();
    }

}

