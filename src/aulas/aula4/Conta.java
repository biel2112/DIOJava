package aulas.aula4;

/**
 * <h1>Conta</h1>
 * A representação da conta de um banco de um cliente
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar
 * dos recursos oferecidos pelo autor
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */

public class Conta {
    String nome;
    double saldo;

    /**
     * Este é o construtor da classe Conta
     * @param nome este é o nome do proprietário da conta
     * @param saldo este é o valor do saldo da conta
     */
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    /**
     * Mensagem de texto do objeto da classe Conta
     *  @return String nome e saldo da conta criada
     */
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSaldo: " + saldo;
    }

    /**
     * Diminui o valor da variável saldo subtraindo pelo valor recebido como parâmetro (Se o saldo
     * for maior do que o valor recebido no parâmetro)
     * @param valor este é o valor que o saldo deverá subtrair
     * @return Saldo subtraído ou uma mensagem de que o saldo é insuficiente para ser sacado
     */
    public void sacar(double valor){
        if(saldo > 0 && saldo >= valor){
            saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    /**
     * Aumenta o valor da variável saldo somando com o valor recebido como parâmetro
     * @param valor este é o valor que o saldo deverá ser somado
     * @return Saldo somado com o valor do parâmetro
     */
    public void depositar(double valor){
            saldo = saldo + valor;
    }
}
