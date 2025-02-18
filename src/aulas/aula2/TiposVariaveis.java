package aulas.aula2;

/**
 * <h1>Tipos de Variáveis</h1>
 * Estudo de Variáveis e conversão de variáveis numéricas
 * Alguns utilizam casts para isso
 *
 * @author gabrielbarruzi
 * @version 1.0
 * @since 18/02/2025
 */
public class TiposVariaveis {
    public static void main(String[] args) {

        short numero = 123;
        int numero2 = numero;
        short numero3 = (short) numero2;
        System.out.println(numero3);

        final float PI = 3.14F;
        System.out.println(PI);
        double pi2 = PI;
        System.out.println(pi2);
    }
}
