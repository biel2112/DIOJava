package aulas.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1>AboutMe</h1>
 * Uma classe de armazenamento informações pessoais e uma mensagem no final apresentando o usuário.
 * Também mostra uma exception caso o usuário forneça um valor não numérico no campo idade.
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class AboutMe {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();
            String nomeCompleto = nome.concat(" ").concat(sobrenome);
            System.out.println("Digite a sua idade:");
            short idade = scanner.nextShort();
            System.out.println("Digite a sua altura:");
            double altura = scanner.nextDouble();
            System.out.println("Olá, meu nome é " + nomeCompleto + ".\n" +
                    "Tenho " + idade + " anos, " +
                    "e minha altura é de " + altura + " metros");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }


    }

}
