package aulas.poo;

import java.util.List;

public class Receita {
    private String nome;
    private List<Ingrediente> ingredientes;
    private String modoDePreparo;

    public Receita(String nome, List<Ingrediente> ingredientes, String modoDePreparo) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
    }

    @Override
    public String toString() {
        return "Receita: "+nome+"\n"+
                "\nIngredientes: \n"+ingredientes+"\n"+
                "\nModo de preparo: \n"+modoDePreparo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }
}
