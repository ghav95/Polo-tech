import services.CalculadoraDeSalarioLiquido;
import services.CalculadoraDeSalarioLiquidoLiskov;
import services.CalculadoraDeSalarioLiquidoVidaLoka01;
import services.CalculadoraDeSalarioLiquidoVidaLoka02;

/*
Criar uma classe pai que siga a seguinte regra de negócio:
1. O salarioBruto não pode ser menor que o salário minimo (1302);
2. Os descontos não podem ser maiores que o sálario bruto;
3. O bonus não deve ser superior a 1000;

a) Criar pelo menos 1 exemplo de classe filha que NÃO viole a substituição de LISKOV
b) Criar pelo menos 1 exemplo de classe filha que viole a substituição de LISKOV
 */
public class Main {
    public static void main(String[] args) {
        CalculadoraDeSalarioLiquido liquido = new CalculadoraDeSalarioLiquido();
        CalculadoraDeSalarioLiquido liquidoLiskov = new CalculadoraDeSalarioLiquidoLiskov();
        CalculadoraDeSalarioLiquido vidaLoka = new CalculadoraDeSalarioLiquidoVidaLoka01();
        CalculadoraDeSalarioLiquido vidaLoka2 = new CalculadoraDeSalarioLiquidoVidaLoka02();

        System.out.println("Liquido: " + liquido.calcular(1500.0, 200.0, 300.0));
        System.out.println("Liquido: " + liquidoLiskov.calcular(1500.0, 200.0, 300.0));
        System.out.println("Liquido: " + vidaLoka.calcular(1199.0, 200.0, 300.0));
        System.out.println("Liquido: " + vidaLoka2.calcular(1200.0, 200.0, 300.0));

    }
}