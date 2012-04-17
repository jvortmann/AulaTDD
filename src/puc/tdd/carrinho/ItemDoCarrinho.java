package puc.tdd.carrinho;

public class ItemDoCarrinho {
    private int quantidade;
    private Item item;

    public ItemDoCarrinho(int quantidade, Item item) {
        this.quantidade = quantidade;
        this.item = item;
    }

    public Float preco() {
        return item.preco();
    }

    public Integer quantidade() {
        return quantidade;
    }

    public Item item() {
        return item;
    }
}
