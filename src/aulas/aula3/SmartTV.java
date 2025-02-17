package aulas.aula3;

import java.util.ArrayList;
import java.util.List;

public class SmartTV {

    private String marca;
    private int polegadas;
    private int canal;
    private int volume;
    private boolean ligada;

    public SmartTV(String marca, int polegadas, int canal, int volume, boolean ligada) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
    }

    @Override
    public String toString() {
       if(ligada == false){
           return "A TV está desligada!";

       }
       else {
           return  "Canal: " + canal +
                   "\nVolume: " + volume;
       }
    }

    public String ligarDesligar(){
        this.ligada = !ligada;
        String mensagem = ligada == true ? "A TV está ligada!" : "A TV está desligada";
        return mensagem;
    }

    public int aumentarVolume(){
        if (ligada == true){
            volume = volume+1;
            System.out.println("Volume:"+volume);
            return volume;
        }
        else{
            System.out.println("A TV está desligada");
            return 0;
        }
    }
    public int diminuirVolume(){
        if (ligada == true){
            volume = volume-1;
            System.out.println("Volume:"+volume);
            return volume;
        }
        else{
            System.out.println("A TV está desligada");
            return 0;
        }
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
