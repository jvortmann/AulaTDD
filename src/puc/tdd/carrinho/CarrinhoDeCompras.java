package puc.tdd.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Carne> itens = new ArrayList<Carne>();

    public List<Carne> itens() {
       return itens;
    }

    public void adiciona(Carne item) {
        itens.add(item);
    }

    public Float total() {
        Float price = 0f;
        for (Carne item : itens) {
            price += item.preco();
        }

        return price;
    }
}
