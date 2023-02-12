import model.Produto;
import service.CalculadoraDeDescontoBlackFriday;
import service.CalculadoraDeDescontoPadrao;
import service.CalculadoraDeFretePadrao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> listProduto = new ArrayList<>();

        Produto p1 = new Produto(70.0, 5.0);
        CalculadoraDeDescontoPadrao calculadoraDeDescontoPadrao = new CalculadoraDeDescontoPadrao();
        CalculadoraDeDescontoBlackFriday calculadoraDeDescontoBlackFriday = new CalculadoraDeDescontoBlackFriday();

        CalculadoraDeFretePadrao calculadoraDeFretePadrao = new CalculadoraDeFretePadrao();

        System.out.println("Desconto padrão: " + calculadoraDeDescontoPadrao.calcular(p1));
        System.out.println("Desconto Black Friday: " + calculadoraDeDescontoBlackFriday.calcular(p1));

        System.out.println("Frete padrão: " + calculadoraDeFretePadrao.calcular(p1, 2010.0));

    }
}