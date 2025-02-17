import aulas.aula3.Carro;
import aulas.aula3.SmartTV;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Testando a classe Carro
//        Carro carro = new Carro("Fusca", "Azul", "ABC-1234", false);
//        System.out.println(carro.ligarOuDesligar());
//        System.out.println(carro.ligarOuDesligar());

        //Testando a classe SmartTV
        SmartTV tv = new SmartTV("SONY", 45, 90, 29, false);
        System.out.println(tv);
        tv.ligarDesligar();
        System.out.println(tv);
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println(tv);
        tv.mudarCanal(26);
        System.out.println(tv);




    }
}