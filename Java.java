import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = {
            "Maria Silva",
            "João Pereira",
            "Fernanda Souza",
            "Carlos Oliveira",
            "Ana Lima"
        };

        // Escolhe um aluno automaticamente (exemplo)
        String aluno = nomes[2]; // Fernanda Souza
        System.out.println("Aluno selecionado: " + aluno);

        double soma = 0;
        double nota;

        System.out.println("\nDigite as 8 notas do aluno " + aluno + ":");

        for (int i = 1; i <= 8; i++) {
            System.out.print("Nota " + i + ": ");
            nota = sc.nextDouble();
            soma += nota;
        }

        double media = soma / 8;
        System.out.println("\nMédia final de " + aluno + ": " + media);

        sc.close();
    }
        }
