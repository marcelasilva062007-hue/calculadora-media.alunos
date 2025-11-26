import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lista de alunos
        String[] alunos = {"Maria Silva", "João Pedro", "Gisele Silva", "Marcela Silva"};

        // Para cada aluno, ler notas e calcular médias
        for (String nome : alunos) {
            double[] notas = lerNotas(entrada, nome);

            double mediaBim1 = calcularMediaBimestral(notas[0], notas[1]);
            double mediaBim2 = calcularMediaBimestral(notas[2], notas[3]);
            double mediaBim3 = calcularMediaBimestral(notas[4], notas[5]);
            double mediaBim4 = calcularMediaBimestral(notas[6], notas[7]);

            double mediaSem1 = calcularMediaSemestral(mediaBim1, mediaBim2);
            double mediaSem2 = calcularMediaSemestral(mediaBim3, mediaBim4);
            double mediaFinal = calcularMediaFinal(mediaSem1, mediaSem2);

            mostrarResultados(nome, mediaSem1, mediaSem2, mediaFinal);
            System.out.println("\n---------------------------\n");
        }

        entrada.close();
    }

    // Função para ler as notas de um aluno
    public static double[] lerNotas(Scanner entrada, String nome) {
        double[] notas = new double[8];
        System.out.println("Digite as 8 notas do aluno " + nome + ":");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        return notas;
    }

    // Função para calcular média bimestral
    public static double calcularMediaBimestral(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // Função para calcular média semestral
    public static double calcularMediaSemestral(double mediaBim1, double mediaBim2) {
        return (mediaBim1 + mediaBim2) / 2;
    }

    // Função para calcular média final
    public static double calcularMediaFinal(double mediaSem1, double mediaSem2) {
        return (mediaSem1 + mediaSem2) / 2;
    }

    // Função para mostrar resultados
    public static void mostrarResultados(String nome, double mediaSem1, double mediaSem2, double mediaFinal) {
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média 1º semestre: %.2f%n", mediaSem1);
        System.out.printf("Média 2º semestre: %.2f%n", mediaSem2);
        System.out.printf("Média final: %.2f%n", mediaFinal);

        if (mediaFinal >= 7) {
            System.out.println("Situação: Aprovado! 🎉");
        } else if (mediaFinal >= 5) {
            System.out.println("Situação: Recuperação 😬");
        } else {
            System.out.println("Situação: Reprovado 😢");
        }
    }
}
