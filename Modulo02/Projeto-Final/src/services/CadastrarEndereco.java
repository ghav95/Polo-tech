package services;
import models.Endereco;
import java.util.Scanner;

public class CadastrarEndereco {

    public static void cadastrarEndereco(){
        Endereco endereco = getNovoEndereco();
        System.out.println("Endereço cadastrado com sucesso!");
        System.out.println(endereco.toString() + "\n");
    }

    public static Endereco getNovoEndereco(){
        String cep, rua, numero, complemento, bairro;
        Scanner io = new Scanner(System.in);


        System.out.print("Digita a rua: ");
        rua = io.next();

        System.out.print("Digite o número: ");
        numero = io.next();

        System.out.print("Digite o complemento: ");
        complemento = io.next();

        System.out.print("Digite o bairro: ");
        bairro = io.next();

        System.out.print("Digite o cep: ");
        cep = io.next();

        return  new Endereco.EnderecoBuilder()
                .cep(cep)
                .rua(rua)
                .numero(numero)
                .complemento(complemento)
                .bairro(bairro)
                .build();

    }
}
