package puc.tdd.shoppingCart;

public class OrderItem {
    private int quantity;
    private Item item;

    public OrderItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public Float price() {
        return item.price();
    }

    public Integer quantity() {
        return quantity;
    }

    public Item item() {
        return item;
    }
}
