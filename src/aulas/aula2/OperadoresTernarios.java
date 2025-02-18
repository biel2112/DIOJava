package aulas.aula2;

import java.util.Scanner;

/**
 * <h1>Operadores Ternários</h1>
 * Estudo de Operadores Ternários
 * O nome é checado para saber se a pessoa se chama Tony Stark
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class OperadoresTernarios {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = leitor.nextLine();
        String frase = nome.equals("Tony Stark") ? "Você é o Homem de Ferro!" :  "Você não é o Homem de Ferro";
        System.out.println(frase);
    }
}
