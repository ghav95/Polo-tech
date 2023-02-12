package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    protected int idCLiente;
    public static List<Cliente> listCliente = new ArrayList<>();
    protected Pessoa pessoa;

    public Cliente(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public int getIdCLiente() { return idCLiente; }
    public void setIdCLiente(int idCLiente) { this.idCLiente = idCLiente; }

    public Pessoa getPessoaResponsavel() { return pessoa; }
    public void setPessoaResponsavel(Pessoa pessoaResponsavel) { this.pessoa = pessoaResponsavel; }

    public Endereco getEnderecoCliente() { return pessoa.getEndereco(); }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.pessoa.setEndereco(enderecoCliente);
    }


    public int getBy(Cliente cliente) {
        return listCliente.indexOf(cliente);
    }
    public Cliente getById(int id) {
        return listCliente.get(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCLiente=" + idCLiente +
                ", pessoa=" + pessoa +
                '}';
    }
}
