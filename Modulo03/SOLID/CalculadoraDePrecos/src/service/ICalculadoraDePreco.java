package service;

import model.Produto;

public interface ICalculadoraDePreco extends ICalculadora<Produto>{
    Double calcular(Produto produto, Double km);
}
