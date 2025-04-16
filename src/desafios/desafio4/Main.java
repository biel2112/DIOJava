package desafios.desafio4;

public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco("Santander");

        Cliente cliente1 = new Cliente("Gabriel", "1234", "123456789-10", "40028922");
        Cliente cliente2 = new Cliente("Rafael", "1235", "123456789-11", "40028933");


        ContaCorrente contaCorrente = new ContaCorrente(cliente1, "12345-6", 10000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2, "12345-7");

        santander.adicionarCliente(cliente1);
        santander.adicionarCliente(cliente2);

        santander.getClientes();

        contaCorrente.depositar(1000.0);
        contaCorrente.imprimir();
        contaCorrente.sacar(10.0);
        contaCorrente.imprimir();

        contaPoupanca.imprimir();
        contaPoupanca.depositar(900.0);
        contaPoupanca.imprimir();
        contaPoupanca.rendimentoMensal();
        contaPoupanca.imprimir();

        contaPoupanca.transferir(100.0, contaCorrente);
        contaPoupanca.imprimir();
        contaCorrente.imprimir();
    }
}
