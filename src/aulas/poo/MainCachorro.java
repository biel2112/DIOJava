package aulas.poo;

public class MainCachorro {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor", "Preto", 12, "Hotweiller");
        System.out.println(cachorro);
        cachorro.emitirSom();
    }

}
