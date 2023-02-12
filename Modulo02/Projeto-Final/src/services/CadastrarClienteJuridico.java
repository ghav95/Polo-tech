package services;

import models.ClienteJuridico;
import models.Pessoa;
import validadores.ValidarCNPJ;
import java.util.Scanner;

public class CadastrarClienteJuridico {

    public static void cadastrarClienteJuridico(){
        ClienteJuridico clienteJuridico = getNovoClienteJuridico();
        System.out.println("Cliente jurídico cadastrado com sucesso!");
        System.out.println(clienteJuridico.toString() + "\n");
    }


    public static ClienteJuridico getNovoClienteJuridico(){
        String cnpj;
        Scanner io = new Scanner(System.in);

        System.out.print("Digite o cnpj: ");
        cnpj = io.next();
        while (!ValidarCNPJ.isValido(cnpj)){
            System.out.print("CNPJ inválido! Digite novamente: ");
            cnpj = io.next();
        }

        Pessoa pessoa = CadastrarPessoa.getNovaPessoa();
        return new ClienteJuridico(pessoa, cnpj);
    }
}

