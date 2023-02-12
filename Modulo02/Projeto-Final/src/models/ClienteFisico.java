package models;

public class ClienteFisico extends Cliente {

    public ClienteFisico(Pessoa pessoa) {
        super(pessoa);
        listCliente.add(this);
        super.idCLiente = listCliente.indexOf(this);
    }

    @Override
    public String toString() {
        return "ClienteFisico{" +
                "idCLiente=" + idCLiente +
                ", pessoa=" + pessoa +
                '}';
    }
}