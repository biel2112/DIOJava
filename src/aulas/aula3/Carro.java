package aulas.aula3;

public class Carro {

    private String modelo;
    private String cor;
    private String placa;
    private boolean ligado;

    public Carro(String modelo, String cor, String placa, boolean ligado) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ligado = ligado;
    }

    public String ligarOuDesligar(){
        this.ligado = !this.ligado;
        String mensagem = this.ligado == true ? "O carro está ligado" :
                "O carro está desligado";
        return mensagem;

    }

}
