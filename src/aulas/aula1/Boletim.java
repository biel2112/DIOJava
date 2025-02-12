package aulas.aula1;

public class Boletim {
    public static void main(String[] args) {
        double mediaFinal = 4.6;
        if(mediaFinal < 5)
            System.out.println("REPROVADO");
        else if (mediaFinal >= 5 && mediaFinal < 6)
            System.out.println("RECUPERAÇÃO");

        else
            System.out.println("REPROVADO");
    }
}
