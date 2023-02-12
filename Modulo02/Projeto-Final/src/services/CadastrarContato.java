package services;

import models.Contato;

import java.util.Scanner;

public class CadastrarContato {

    public static void cadastrarContato(){
        Contato contato = getNovoContato();
        System.out.println("Contato cadastrado com sucesso!");
        System.out.println(contato.toString() + "\n");
    }

    public static Contato getNovoContato(){
        Contato contato;
        String email, celular, whatsapp;

        Scanner io = new Scanner(System.in);

        System.out.print("Digite o email: ");
        email = io.next();

        System.out.print("Digite o celular: ");
        celular = io.next();

        System.out.print("Digite o whatsapp: ");
        whatsapp = io.next();

        return new Contato.ContatoBuilder()
                .celular(celular)
                .whatsapp(whatsapp)
                .email(email)
                .build();
    }
}
