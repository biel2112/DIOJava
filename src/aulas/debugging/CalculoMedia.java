package aulas.debugging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] alunos = {"Luffy", "Zoro", "Nami", "Usopp"};

            double media = calcularMediaSala(alunos, scanner);

            System.out.printf("Média da sala: %.2f", media);
        } catch (InputMismatchException e) {
            e.getStackTrace();
            System.out.println("Os valores precisam ser inteiros");
        }
    }

    public static double calcularMediaSala(String[] alunos, Scanner scanner){
        double soma  = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma/alunos.length;
    }


}
