package puc.tdd.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public List<OrderItem> items() {
       return items;
    }

    public ShoppingCart add(Item item) {
        add(1, item);
        return this;
    }

    public ShoppingCart add(int quantity, Item item) {
        items.add(new OrderItem(quantity, item));
        return this;
    }

    public Float total() {
        Float price = 0f;
        for (OrderItem orderItem : items) {
            price += orderItem.price();
        }

        return price;
    }

    public Integer totalOfItems() {
        Integer totalOfItems = 0;
        for (OrderItem orderItem : items) {
            totalOfItems += orderItem.quantity();
        }

        return totalOfItems;
    }
}
