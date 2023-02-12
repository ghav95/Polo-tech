package service;

import model.Produto;

public interface ICalculadoraDeFrete extends ICalculadora<Produto>{
    Double calcular(Produto produto, Double km) throws FreteIndisponivelException;
}
