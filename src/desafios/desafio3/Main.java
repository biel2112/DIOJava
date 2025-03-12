package desafios.desafio3;

public class Main {

    public static void main(String[] args) {
        Contato contato = new Contato("Yudi","40028922");
        Musica musica = new Musica("Bohemian Rhapsody","Queen");
        Iphone iphone = new Iphone();

        iphone.ligar(contato);
        iphone.tocar(musica);
        iphone.selecionarMusica(musica);
    }

}
