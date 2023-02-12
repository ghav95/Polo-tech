package services;

public interface ICalculadoraDeSalarioLiquido {
    Double calcular(Double salarioBruto, Double descontos, Double bonus) throws ValorInvalidoException;
}
