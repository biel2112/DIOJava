
import desafios.desafio1.ContaBanco;

import java.util.Scanner;

/**
 * Classe de testes do programa.
 * Contém o método main para execução.
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class Main {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            ContaBanco conta = new ContaBanco();
            conta.saldo = 237.48;
            System.out.println("Olá, cliente!\n" +
                    "Por favor, digite seu número da conta");
            conta.numero = leitor.nextInt();
            System.out.println("Agora, sua agência:");
            leitor.nextLine();
            conta.agencia = leitor.next();
            System.out.println("Seu nome:");
            leitor.nextLine();
            conta.nomeCliente = leitor.nextLine();

            System.out.println("Olá, "+conta.nomeCliente+", obrigado por criar uma conta em nosso banco. Sua agência é " +
                    conta.agencia+", conta "+conta.numero+", e seu saldo de R$ "+conta.saldo+" já está disponível para saque!");




    }}

