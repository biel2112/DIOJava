package aulas.aula1;

import java.util.Scanner;

/**
 * <h1>Maioridade</h1>
 * A representação da maioridade de uma pessoa e também para o estudo de um if.
 * Caso a idade da pessoa seja menor do que 18, a pessoa pode assistir Deadpool e Wolverine
 * Caso a idade seja maior ou igual a 18, a pessoa pode assistir ao filme
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class Maioridade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        short minhaIdade = leitor.nextShort();
        if(minhaIdade < 18){
            System.out.println("Você não pode assistir Deadpool e Wolverine!");
        }
        else {
            System.out.println("Curta Deadpool e Wolverine! Bom filme!");
        }
    }
}
