package models;

import validadores.ValidarCPF;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public static List<Pessoa> listPessoa = new ArrayList<>();
    protected int idPessoa;
    protected String nomePessoa;
    protected String dataNascimento;
    protected char sexo;
    protected String cpf;
    protected Endereco endereco;
    protected Contato contato;
    protected EnumFormaDeDescobrimentoDaEmpresa formaDeDescobrimentoDaEmpresa;

    public Pessoa(){

    }

    public Pessoa(String nomePessoa, String dataNascimento, char sexo, String cpf, Endereco endereco, Contato contato) {
        this.nomePessoa = nomePessoa;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        listPessoa.add(this);
        this.idPessoa = listPessoa.indexOf(this);
    }


    public int getIdPessoa() { return idPessoa; }

    public String getNomePessoa() { return nomePessoa; }
    public void setNomePessoa(String nomePessoa) { this.nomePessoa = nomePessoa; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) {
        if(ValidarCPF.isValido(cpf)) this.cpf = cpf;
    }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public Contato getContato() { return contato; }
    public void setContato(Contato contato) { this.contato = contato; }

    public EnumFormaDeDescobrimentoDaEmpresa getFormaDeDescobrimentoDaEmpresa() { return formaDeDescobrimentoDaEmpresa; }
    public void setFormaDeDescobrimentoDaEmpresa(EnumFormaDeDescobrimentoDaEmpresa formaDeDescobrimentoDaEmpresa) { this.formaDeDescobrimentoDaEmpresa = formaDeDescobrimentoDaEmpresa; }


    public static class PessoaBuilder{
        protected static List<Pessoa> listPessoa = new ArrayList<>();
        protected String nomePessoa;
        protected String dataNascimento;
        protected char sexo;
        protected String cpf;
        protected Endereco endereco;
        protected Contato contato;
        protected EnumFormaDeDescobrimentoDaEmpresa formaDeDescobrimentoDaEmpresa;

        public PessoaBuilder nomePessoa(String nomePessoa){this.nomePessoa = nomePessoa; return this;}
        public PessoaBuilder dataNascimento(String dataNascimento){this.dataNascimento = dataNascimento; return this;}
        public PessoaBuilder sexo(char sexo){this.sexo = sexo; return this;}
        public PessoaBuilder cpf(String cpf){this.cpf = cpf; return this;}
        public PessoaBuilder endereco(Endereco endereco){this.endereco = endereco; return this;}
        public PessoaBuilder contato(Contato contato){this.contato = contato; return this;}
        public PessoaBuilder EnumFormaDeDescobrimentoDaEmpresa(EnumFormaDeDescobrimentoDaEmpresa formaDeDescobrimentoDaEmpresa){this.formaDeDescobrimentoDaEmpresa = formaDeDescobrimentoDaEmpresa; return this;}
        public Pessoa build(){
            return new Pessoa(nomePessoa, dataNascimento, sexo, cpf, endereco, contato);
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", formaDeDescobrimentoDaEmpresa=" + formaDeDescobrimentoDaEmpresa +
                '}';
    }
}
