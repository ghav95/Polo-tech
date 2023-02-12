package services;

import models.Contato;
import models.Endereco;
import models.Pessoa;
import validadores.ValidarCPF;

import java.util.Scanner;

public class CadastrarPessoa {

    public static void cadastrarPessoa(){
        Pessoa pessoa = getNovaPessoa();
        System.out.println("Pessoa cadastrada com sucesso!");
        System.out.println(pessoa.toString() + "\n");
    }

    public static Pessoa getNovaPessoa(){
        String nome, cpf, dataNascimento;
        char sexo;
        Scanner io = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = io.next();

        System.out.print("Digite o cpf: ");
        cpf = io.next();
        while (!ValidarCPF.isValido(cpf)) {
            System.out.print("CPF inválido! Digite novamente: ");
            cpf = io.next();
        }

        System.out.print("Digite o sexo: ");
        sexo = io.next().charAt(0);

        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        dataNascimento = io.next();

        Contato contato = CadastrarContato.getNovoContato();
        Endereco endereco = CadastrarEndereco.getNovoEndereco();
        return new Pessoa.PessoaBuilder()
                .nomePessoa(nome)
                .dataNascimento(dataNascimento)
                .sexo(sexo)
                .cpf(cpf)
                .endereco(endereco)
                .contato(contato)
                .build();
    }


}
