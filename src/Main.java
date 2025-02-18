import aulas.aula4.Conta;

public class Main {
    public static void main(String[] args) {

        //Testando a classe Carro
//        Carro carro = new Carro("Fusca", "Azul", "ABC-1234", false);
//        System.out.println(carro.ligarOuDesligar());
//        System.out.println(carro.ligarOuDesligar());

        //Testando a classe SmartTV
//        SmartTV tv = new SmartTV("SONY", 45, 90, 29, false);
//        System.out.println(tv);
//        tv.ligarDesligar();
//        System.out.println(tv);
//        tv.aumentarVolume();
//        tv.aumentarVolume();
//        System.out.println(tv);
//        tv.mudarCanal(26);
//        System.out.println(tv);

//        Testando classe Conta
        Conta conta = new Conta("Gabriel", 190.0);
        System.out.println(conta);
        conta.depositar(19);
        System.out.println(conta);
        conta.sacar(220);




    }
}