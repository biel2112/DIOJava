package desafios.desafio4;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(Cliente cliente, String numero, Double limite) {
        super(cliente, numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimir() {
        System.out.println("Conta Corrente: " + numero + " | Saldo: R$" + saldo + " | Limite: R$" + limite);
    }
}
