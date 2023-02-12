package services;

/*
Criar uma classe pai que siga a seguinte regra de negócio:
1. O salarioBruto não pode ser menor que o salário minimo (1302);
2. Os descontos não podem ser maiores que o sálario bruto;
3. O bonus não deve ser superior a 1000;

a) Criar pelo menos 1 exemplo de classe filha que NÃO viole a substituição de LISKOV
b) Criar pelo menos 1 exemplo de classe filha que viole a substituição de LISKOV
 */
public class CalculadoraDeSalarioLiquido implements ICalculadoraDeSalarioLiquido{
    public Double calcular(Double salarioBruto, Double descontos, Double bonus){

        if(salarioBruto < 1302) throw new ValorInvalidoException("Salário bruto não pode ser inferior a R$1.302,00!");

        if(descontos > salarioBruto) throw new ValorInvalidoException("Descontos não podem ser maiores que o salário bruto!");

        if(bonus > 1000) throw new ValorInvalidoException("Bônus não pode exceder R$ 1.000,00!");

        return salarioBruto - descontos + bonus;
    }
}
