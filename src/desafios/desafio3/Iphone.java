package desafios.desafio3;

public class Iphone implements AparelhoTelefonico,NavegadorWeb,ReprodutorMusical{

    public Iphone() {
    }

    @Override
    public void ligar(Contato contato) {
        System.out.println("Ligando para "+contato.getNome() + " ("+contato.getNumero()+")");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Encaminhando para correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo site "+url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Reiniciando a página");
    }

    @Override
    public void tocar(Musica musica) {
        System.out.println("Tocando "+musica.getNome());
    }


    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando "+musica.getNome()+" - "+musica.getArtista());
    }
}
