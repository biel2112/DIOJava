package desafios.desafio4;

import java.util.ArrayList;

public class Banco {

    public String nome;

    private ArrayList<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getClientes() {
        for(Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
}
