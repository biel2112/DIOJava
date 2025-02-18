package aulas.aula2;

import java.util.Scanner;

/**
 * <h1>Operadores</h1>
 * Estudo de Operadores e tipos de variáveis
 * O nome é checado para saber se a pessoa se chama Daniel
 * E o valor de sua idade aumentará cada vez que chamar a função fazerAniversario()
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class Operadores {

    public static short fazerAniversario(short idade){
        idade++;
        return idade;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        final String nome = leitor.next();
        System.out.println("Digite sua idade:");
        short idade = leitor.nextShort();
       //char sexo = 'M';
       //boolean legal = true;
       //Date dataNascimento = new Date();


        if(!nome.equals("Daniel")){
            System.out.println("Você não é o Daniel");
        }
        idade = fazerAniversario(idade);
        System.out.println(idade);

    }

}
