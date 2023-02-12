package services;
/*
Criar uma classe pai que siga a seguinte regra de negócio:
1. O salarioBruto não pode ser menor que o salário minimo (1302);
2. Os descontos não podem ser maiores que o sálario bruto;
3. O bonus não deve ser superior a 1000;

a) Criar pelo menos 1 exemplo de classe filha que NÃO viole a substituição de LISKOV
b) Criar pelo menos 1 exemplo de classe filha que viole a substituição de LISKOV
 */
//VIOLANDO PRINCÍPIOS: Subclasse aceita um parâmetro de entrada menor que a classe pai, quebrando o comportamento

public class CalculadoraDeSalarioLiquidoVidaLoka01 extends CalculadoraDeSalarioLiquido{
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {
        if(salarioBruto < 1200) throw new ValorInvalidoException("Salário não pode ser inferior a R$1200,00! Não pode ser substitúida pela classe base, portanto fere princípcio de Liskov!");
        return salarioBruto - descontos + bonus - 500;
    }
}
