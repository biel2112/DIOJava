package aulas.poo;

public record Ingrediente(String nome, int quantidade, String medida) {

    @Override
    public String toString() {
        return "\n"+quantidade+" "+medida+" de "+nome;
    }
}
