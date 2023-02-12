package services;

import models.*;

public class Listar {

    public static void listarTodosElementosNaBase(){
        try
        {
            if (!isQtdRegistroVazio()){
                System.out.println("Não há registros cadastrados!");
                return;
            }
            mostrarTodosRegistros();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static boolean isQtdRegistroVazio(){
        return     !Cliente.listCliente.isEmpty()
                || !Contato.listContato.isEmpty()
                || !Endereco.listEndereco.isEmpty()
                || !Pessoa.listPessoa.isEmpty()
                || !Usuario.listUsuario.isEmpty();
    }


    public static void mostrarTodosRegistros(){
        Cliente.listCliente.forEach( cliente -> { System.out.println( cliente.toString() ); } );
        Contato.listContato.forEach( contato -> { System.out.println( contato.toString() ); } );
        Endereco.listEndereco.forEach(endereco -> { System.out.println( endereco.toString() ); } );
        Pessoa.listPessoa.forEach(pessoa -> { System.out.println( pessoa.toString() ); } );
        Usuario.listUsuario.forEach(usuario -> { System.out.println( usuario.toString() ); } );
    }
}
