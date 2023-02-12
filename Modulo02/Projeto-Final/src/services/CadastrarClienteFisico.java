package services;

import models.ClienteFisico;
import models.Pessoa;

public class CadastrarClienteFisico {

    public static void cadastrarClienteFisico(){
        ClienteFisico clienteFisico = getNovoClienteFisico();
        System.out.println("Cliente cadastrada com sucesso!");
        System.out.println(clienteFisico.toString() + "\n");
    }

    public static ClienteFisico getNovoClienteFisico(){
        Pessoa pessoa = CadastrarPessoa.getNovaPessoa();
        return new ClienteFisico(pessoa);
    }
}
