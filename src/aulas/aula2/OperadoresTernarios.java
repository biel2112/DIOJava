package aulas.aula2;

import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = leitor.nextLine();
        String frase = nome.equals("Tony Stark") ? "Você é o Homem de Ferro!" :  "Você não é o Homem de Ferro";
        System.out.println(frase);
    }
}
