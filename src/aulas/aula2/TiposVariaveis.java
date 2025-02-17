package aulas.aula2;

public class TiposVariaveis {
    public static void main(String[] args) {

        boolean legal = true;

        short numero = 123;
        int numero2 = numero;
        short numero3 = (short) numero2;

        final float PI = 3.14F;
        System.out.println(PI);
        double pi2 = PI;
        System.out.println(pi2);
    }
}
