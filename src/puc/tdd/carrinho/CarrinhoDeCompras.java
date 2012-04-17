package puc.tdd.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<Item>();

    public List<Item> itens() {
       return itens;
    }

    public CarrinhoDeCompras adiciona(Item item) {
        itens.add(item);
        return this;
    }

    public CarrinhoDeCompras adiciona(int quantidade, Item item) {
        for (int i = 0; i < quantidade; i++) {
            adiciona(item);
        }

        return this;
    }

    public Float total() {
        Float price = 0f;
        for (Item item : itens) {
            price += item.preco();
        }

        return price;
    }
}
