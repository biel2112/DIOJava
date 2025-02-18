package aulas.aula3;

/**
 * <h1>Carro</h1>
 * A representação do modelo de um carro
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar
 * dos recursos oferecidos pelo autor
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class Carro {

    final String modelo;
    String cor;
    String placa;
    boolean ligado;

    /**
     * Este é o construtor da classe Carro
     * @param modelo este é o modelo do carro
     * @param cor esta é a cor do carro
     * @param placa esta é a placa do carro
     * @param ligado esta é a indicação de que o carro está ligado(true) ou desligado(false)
     */
    public Carro(String modelo, String cor, String placa, boolean ligado) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ligado = ligado;
    }


    /**
     * Modifica o valor atual da variável ligado para seu oposto
     * @return Mensagem de texto que indica se o carro está ligado (true) ou desligado (false)
     */
    public String ligarOuDesligar(){
        this.ligado = !this.ligado;
        String mensagem = this.ligado ? "O carro está ligado" :
                "O carro está desligado";
        return mensagem;

    }

}
