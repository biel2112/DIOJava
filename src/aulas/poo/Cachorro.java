package aulas.poo;

public class Cachorro extends DadosAnimal{



    private String raca;

    public Cachorro(String nome, String cor, int idade, String raca) {
        super(nome, cor, idade);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Nome: "+this.getNome()+"\n"
                +"Raça "+this.getRaca()+"\n"
                +"Idade: "+this.getIdade()+"\n"
                +"Cor "+this.getCor();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
