package puc.tdd.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemDoCarrinho> itens = new ArrayList<ItemDoCarrinho>();

    public List<ItemDoCarrinho> itens() {
       return itens;
    }

    public CarrinhoDeCompras adiciona(Item item) {
        adiciona(1, item);
        return this;
    }

    public CarrinhoDeCompras adiciona(int quantidade, Item item) {
        itens.add(new ItemDoCarrinho(quantidade, item));
        return this;
    }

    public Float total() {
        Float total = 0f;
        for (ItemDoCarrinho item : itens) {
            total += item.preco();
        }

        return total;
    }

    public Integer totalDeItens() {
        Integer totalDeItens = 0;
        for (ItemDoCarrinho item : itens) {
            totalDeItens += item.quantidade();
        }

        return totalDeItens;
    }
}
