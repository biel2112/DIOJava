package aulas.poo;

public class MainAnimal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor", "Preto", 12, "Hotweiller");
        System.out.println(cachorro);
        cachorro.emitirSom();

        Gato gato = new Gato("Freya", "ND", "Cinza", 4);
        System.out.println(gato.nome());
        gato.fazerAniversario(gato.idade());
        System.out.println(gato);
    }

}
