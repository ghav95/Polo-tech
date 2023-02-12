package service;

import model.Produto;

public interface ICalculadoraDeDesconto extends ICalculadora<Produto>{
    Double calcular(Produto produto);
}
