//Escreva um programa Java para converter minutos em um número de anos e dias.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int[] anos = getAnosMinutos(sc.nextInt());
        System.out.println("Anos: " + anos[0] + " Dias: " + (anos[1]/1440));
    }
    private static int[] getAnosMinutos(int minutos){
        int[] anosMinutos = {0,0};
        while(minutos >= 525600){
            minutos -= 525600;
            anosMinutos[0]++;
        }
        anosMinutos[1] = minutos;
        return anosMinutos;
    }
}