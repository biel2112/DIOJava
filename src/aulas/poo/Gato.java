package aulas.poo;

public record Gato(String nome, String raca, String cor, int idade) implements Animal {

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void fazerAniversario(int idade){
        new Gato(this.nome(),this.raca(),this.cor(),(this.idade())+1);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
