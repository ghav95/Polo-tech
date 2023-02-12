package services;

import java.util.Scanner;

public class Cadastrar {
    public static void cadastrar() {
        boolean continua = true;
        while (continua) {
            Scanner io = new Scanner(System.in);
            imprimirMenu();
            continua = navegacao(io.nextInt());

        }
    }
    private static void imprimirMenu(){
        System.out.println("--------------------------");
        System.out.println("| # |      SERVIÇO       |");
        System.out.println("--------------------------");
        System.out.println("| 1 | Cadastrar Cliente  |");
        System.out.println("| 2 | Cadastrar Contato  |");
        System.out.println("| 3 | Cadastrar Endereco |");
        System.out.println("| 4 | Listar cadastros   |");
        System.out.println("| 5 | Cadastrar Pessoa   |");
        System.out.println("| 6 | Ordem de Servico   |");
        System.out.println("| 7 | Cadastrar Usuário  |");
        System.out.println("| 8 | Sair               |");
        System.out.println("|________________________|");
        System.out.print("Digite o serviço desejado: ");
    }



    private static boolean navegacao(int escolhaMenu){
        switch (escolhaMenu) {
            case 1 -> CadastrarCliente.cadastraCliente();
            case 2 -> CadastrarContato.cadastrarContato();
            case 3 -> CadastrarEndereco.cadastrarEndereco();
            case 4 -> Listar.listarTodosElementosNaBase();
            case 5 -> CadastrarPessoa.cadastrarPessoa();
            case 6 -> System.out.println("Função não implementada nesta versão!");
            case 7 -> System.out.println("Função não implementada nessa versão!");
            case 8 -> {return false;}
        }
        return true;
    }
}