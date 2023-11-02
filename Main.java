import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de alunos:");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ":");
            System.out.println();
            String nome = scanner.nextLine();
            System.out.println();

            System.out.println("Informe a idade do aluno " + (i + 1) + ":");
            System.out.println();
            int idade = Integer.parseInt(scanner.nextLine());
            System.out.println();

            System.out.println("Informe a matrícula do aluno " + (i + 1) + ":");
            System.out.println();
            String matricula = scanner.nextLine();
            System.out.println();

            System.out.println("Informe as notas do aluno " + (i + 1) + ":");
            System.out.println();
            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Nota do bimestre " + (j + 1) + ":");
                notas[j] = Double.parseDouble(scanner.nextLine());
                System.out.println();
            }

            Aluno aluno = new Aluno(nome, idade, matricula);
            aluno.setNotas(notas, matricula);
            alunos.add(aluno);
        }

        double mediaGeral = 0;
        for (Aluno aluno : alunos) {
            mediaGeral += aluno.getMedia();
        }
        mediaGeral /= n;

        System.out.println("Relatório dos alunos:");
        System.out.println("Média geral: " + mediaGeral);
        for (Aluno aluno : alunos) {
            aluno.imprimir();
            System.out.println(); 
        }
    }

}

