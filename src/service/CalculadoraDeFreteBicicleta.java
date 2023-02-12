package service;

import model.Produto;

public class CalculadoraDeFreteBicicleta implements ICalculadoraDeFrete{

    @Override
    public Double calcular(Produto produto, Double km)
    {
        double precoPorKm = 0.2;

        if(km > 3) precoPorKm = 0.3;
        if(km > 4) precoPorKm = 0.4;
        if(km > 5) precoPorKm = 0.5;
        if(km > 6) throw new FreteIndisponivelException("Entregas de bicicleta não podem ultrapassar 6 km!");

        return produto.getPeso() * precoPorKm * km;
    }
}
