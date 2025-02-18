package aulas.aula4;

public class Conta {
    String nome;
    double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSaldo: " + saldo;
    }

    public void sacar(double valor){
        if(saldo > 0 && saldo >= valor){
            saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void depositar(double valor){
            saldo = saldo + valor;
    }
}
