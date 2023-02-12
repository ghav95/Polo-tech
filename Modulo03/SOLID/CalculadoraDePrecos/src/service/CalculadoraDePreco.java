package service;

import model.Produto;

public class CalculadoraDePreco implements ICalculadoraDePreco{

    private final CalculadoraDeFretePadrao calculadoraDeFrete;
    private final CalculadoraDeDescontoPadrao calculadoraDeDesconto;

    public CalculadoraDePreco(CalculadoraDeFretePadrao calculadoraDeFrete, CalculadoraDeDescontoPadrao calculadoraDeDesconto) {
        this.calculadoraDeFrete = calculadoraDeFrete;
        this.calculadoraDeDesconto = calculadoraDeDesconto;
    }

    public CalculadoraDeFretePadrao getCalculadoraDeFrete() {
        return calculadoraDeFrete;
    }

    public CalculadoraDeDescontoPadrao getCalculadoraDeDesconto() {
        return calculadoraDeDesconto;
    }

    @Override
    public Double calcular(Produto produto, Double km) {
        Double frete = calculadoraDeFrete.calcular(produto, km);
        Double desconto = calculadoraDeDesconto.calcular(produto);
        return produto.getPreco() + frete - desconto;
    }
}
