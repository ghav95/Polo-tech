package models;

public class ClienteJuridico extends Cliente{
    private String cnpj;

    public ClienteJuridico(Pessoa pessoa, String cnpj) {
        super(pessoa);
        this.cnpj = cnpj;
        listCliente.add(this);
        idCLiente = listCliente.indexOf(this);
    }

    public Pessoa getPessoaResponsavel() { return super.pessoa; }
    public void setPessoaResponsavel(Pessoa pessoaResponsavel) { super.setPessoaResponsavel(pessoaResponsavel); }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "cnpj='" + cnpj + '\'' +
                ", idCLiente=" + idCLiente +
                ", pessoa=" + pessoa +
                '}';
    }
}
