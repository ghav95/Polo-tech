package service;

import model.Produto;

public class CalculadoraDeFretePadrao implements ICalculadoraDeFrete{

    @Override
    public Double calcular(Produto produto, Double km) {
        if(km > 2000) throw new FreteIndisponivelException("Frete indisponível!");
        return produto.getPeso() * 0.6 * km;
    }
}
