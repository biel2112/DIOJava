package desafios.desafio4;

public abstract class Conta implements Imprimivel{

    protected Cliente cliente;
    protected String numero;
    protected Double saldo;

    public Conta(Cliente cliente, String numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor){
        saldo += valor;
    }

    public void sacar(Double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
        else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void transferir(Conta conta1, Double valor, Conta conta2){
        conta1.saldo -= valor;
        conta2.saldo += valor;
    }

    @Override
    public void imprimir(){
        System.out.println("Número: "+numero
                            +"\nSaldo: "+saldo);
    }


}
