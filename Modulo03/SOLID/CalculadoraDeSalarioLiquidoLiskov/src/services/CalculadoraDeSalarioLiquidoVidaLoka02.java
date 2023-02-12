package services;
/*
Criar uma classe pai que siga a seguinte regra de negócio:
1. O salarioBruto não pode ser menor que o salário minimo (1302);
2. Os descontos não podem ser maiores que o sálario bruto;
3. O bonus não deve ser superior a 1000;

a) Criar pelo menos 1 exemplo de classe filha que NÃO viole a substituição de LISKOV
b) Criar pelo menos 1 exemplo de classe filha que viole a substituição de LISKOV
 */
//VIOLANDO PRINCÍPIOS: Subclasse retorna exception, quebrando o comportamento

public class CalculadoraDeSalarioLiquidoVidaLoka02 extends CalculadoraDeSalarioLiquido{
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        throw new IllegalArgumentException("Não deveria ser uma classe derivada! Fere princípio de Liskov");
    }
}
