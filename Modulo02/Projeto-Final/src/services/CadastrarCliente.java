package services;

import java.util.Scanner;

public class CadastrarCliente {

    public static void cadastraCliente() {

        try
        {
            Scanner io = new Scanner(System.in);
            mostrarMenu();
            if(io.nextInt() == 1) {
                CadastrarClienteJuridico.cadastrarClienteJuridico();
                return;
            }
            CadastrarClienteFisico.cadastrarClienteFisico();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

    }

    public static void mostrarMenu(){
        System.out.println("-----------------------");
        System.out.println("| # |   TIPO CLIENTE   |");
        System.out.println("-----------------------");
        System.out.println("| 1 | Cliente Jurídico |");
        System.out.println("| 2 | Cliente Físico   |");
        System.out.println("|----------------------|");
        System.out.print("Tipo de cliente: ");
    }
}
