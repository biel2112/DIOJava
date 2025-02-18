package aulas.aula3;

/**
 * <h1>SmartTV</h1>
 * A representação de uma SmartTV
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar
 * dos recursos oferecidos pelo autor
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class SmartTV {

    final String marca;
    final int polegadas;
    int canal;
    int volume;
    boolean ligada;

    /**
     * Este é o construtor da classe SmartTV
     * @param marca esta é a marca da TV
     * @param polegadas este é o valor das polegadas da TV
     * @param canal este é o valor do canal atual da TV
     * @param volume este é o valor do volume atual da TV
     * @param ligada este é o indicador de que a TV está ligada (true) ou desligada (false)
     */
    public SmartTV(String marca, int polegadas, int canal, int volume, boolean ligada) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
    }

    /**
     * Mensagem de texto do print da variável do objeto de SmartTV
     * @return Mensagem de que a TV está desligada ou mostra o canal atual e o volume atual da TV
     */
    @Override
    public String toString() {
       if(!ligada){
           return "A TV está desligada!";

       }
       else {
           return  "Canal: " + canal +
                   "\nVolume: " + volume;
       }
    }

    /**
     * Muda o valor de ligada para seu oposto e imprime uma mensagem de texto
     * @return Mensagem de texto indicando que a TV está ligada (true) ou desligada (false)
     */
    public String ligarDesligar(){
        this.ligada = !ligada;
        String mensagem = ligada ? "A TV está ligada!" : "A TV está desligada";
        return mensagem;
    }

    /**
     * Aumenta o valor da variável volume
     * @return Retorna o valor novo da TV ou 0 caso a TV esteja desligada (ligada == false)
     */
    public int aumentarVolume(){
        if (ligada){
            volume = volume+1;
            System.out.println("Volume:"+volume);
            return volume;
        }
        else{
            System.out.println("A TV está desligada");
            return 0;
        }
    }

    /**
     * Diminui o valor da variável volume
     * @return Retorna o valor novo da TV ou 0 caso a TV esteja desligada (ligada == false)
     */
    public int diminuirVolume(){
        if (ligada){
            volume = volume-1;
            System.out.println("Volume:"+volume);
            return volume;
        }
        else{
            System.out.println("A TV está desligada");
            return 0;
        }
    }

    /**
     * Muda o valor da variável canal para o valor recebido como parâmetro
     * @param novoCanal este é o valor do canal que deverá ser o novo canal atual
     */
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
