package aulas.exceptions;

import java.util.Scanner;

/**
 * <h1>Calculadora</h1>
 * Uma classe de calculadora para estudo de Exception.
 * Nesse caso, mostrar uma exception caso o divisor seja 0
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class Calculadora {
    public int dividir(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número para ser dividido:");
            int a = scanner.nextInt();
            System.out.println("Digite um número para ser o divisor:");
            int b = scanner.nextInt();
            Calculadora calc = new Calculadora();
            System.out.println(calc.dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("O divisor nunca pode ser 0");
        }
    }
}
