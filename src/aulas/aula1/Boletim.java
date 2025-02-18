package aulas.aula1;

import java.util.Scanner;

/**
 * <h1>Boletim</h1>
 * A representação do boletim de um aluno e também para o estudo de um if.
 * Caso a média final seja menor do que 5, o aluno está reprovado.
 * Caso a média final seja maior ou igual a 5, e menor do que 6, o aluno está de recuperação
 * Caso a média final seja maior ou igual a 6, o aluno está aprovado
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class Boletim {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua média");

        double mediaFinal = leitor.nextDouble();
        if(mediaFinal < 5)
            System.out.println("REPROVADO");
        else if (mediaFinal >= 5 && mediaFinal < 6)
            System.out.println("RECUPERAÇÃO");

        else
            System.out.println("REPROVADO");
    }
}
