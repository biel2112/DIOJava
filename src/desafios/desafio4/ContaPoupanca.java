package desafios.desafio4;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, String numero) {
        super(cliente, numero);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "cliente=" + cliente +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void rendimentoMensal(){
        saldo = saldo + (saldo * 0.05);
    }

    @Override
    public void imprimir() {
        System.out.println("Conta Poupança: " + numero + " | Saldo: R$" + saldo);
    }
}
