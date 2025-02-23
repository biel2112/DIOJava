package aulas.poo;

public class Ingrediente {
    private String nome;
    private int quantidade;
    private String medida;

    @Override
    public String toString() {
        return "\n"+quantidade+" "+medida+" de "+nome;
    }

    public Ingrediente(String nome, int quantidade, String medida) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
}
