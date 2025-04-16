package aulas.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Consumer -> Consome um valor
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        //Supplier -> Mostra um valor
        Supplier<String> saudacao = () -> "Olá, meu caro";

        //Function -> Recebe um dado diferente do dado retornado (String -> Integer)
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Predicate -> Consome um valor e retorna boolean para testar
        Predicate<Integer> numeroPar = numero -> numero % 2 == 0;

        // BinaryOperator -> Recebe dois valores do mesmo tipo e retorna um valor do mesmo tipo também
        BinaryOperator<Integer> somar =  (n1, n2) -> n1 + n2;

        //Testando o Consumer
        numeros.stream().forEach(imprimirNumeroPar);

        //Testando o Supplier
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        listaSaudacoes.forEach(System.out::println);

        //Testando Function

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        numerosDobrados.forEach(System.out::println);

        //Testando Predicate
        numeros.stream()
                .filter(numeroPar)
                .forEach(System.out::println);

        //Testandp BinaryOperator
        int resultado = numeros.stream()
                .reduce(0, somar);

        System.out.println(resultado);
    }

}
