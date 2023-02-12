package service;

import model.Produto;

public class CalculadoraDeDescontoBlackFriday implements ICalculadoraDeDesconto {

    @Override
    public Double calcular(Produto produto)
    {
        return produto.getPreco() * 0.3;
    }

}
