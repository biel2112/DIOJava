package desafios.desafio4;

public class Cliente {

    private String nome;
    private String senha;
    private String cpf;
    private String celular;

    public Cliente(String nome, String senha, String cpf, String celular) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
