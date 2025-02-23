package aulas.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da receita:");
        String nomeReceita = scanner.nextLine();
        int opc = 1;
        List<Ingrediente> ingredientes = new ArrayList<>();
        while(opc == 1){
            System.out.println("Digite o nome do ingrediente:");
            String nomeIngrediente = scanner.next();
            System.out.println("Digite a quantidade do ingrediente:");
            int quantidadeIngrediente = scanner.nextInt();
            System.out.println("Digite a medida do ingrediente:");
            String medidaIngrediente = scanner.next();
            Ingrediente ingrediente = new Ingrediente(nomeIngrediente, quantidadeIngrediente, medidaIngrediente);
            ingredientes.add(ingrediente);
            System.out.println("Digite algo diferente de 1 para sair");
            opc = scanner.nextInt();
        }
        System.out.println("Digite o modo de preparo:");
        scanner.next();
        String modoDePreparo = scanner.nextLine();

        Receita receita = new Receita(nomeReceita, ingredientes, modoDePreparo);
        System.out.println(receita);

    }
}
