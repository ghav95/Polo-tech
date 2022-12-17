import java.util.Scanner;
public class Main {
    /*Crie um método que defina um atributo do tipo int e um atributo do tipo String.
    Caso esse número seja correspondente a algum mês do ano, retorne o nome do mês*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");
        System.out.print(estamosEmQualMes(in.nextInt()));
    }
    private static String estamosEmQualMes(int numeroDoMes){
        return switch (numeroDoMes) {
            case 1  -> "Janeiro";
            case 2  -> "Fevereiro";
            case 3  -> "Março";
            case 4  -> "Abril";
            case 5  -> "Maio";
            case 6  -> "Junho";
            case 7  -> "Julho";
            case 8  -> "Agosto";
            case 9  -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inexistente";
        };
    }

}