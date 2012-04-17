package puc.tdd.shoppingCart;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShoppingCartTest {
    private ShoppingCart shoppingCart;
    private Meat meat;
    private Beer beer;

    @Before
    public void setUp() throws Exception {
        shoppingCart = new ShoppingCart();
        meat = new Meat();
        beer = new Beer();
    }

    @Test
    public void shouldAddItemToShoppingCart() {
        shoppingCart.add(meat);

        assertThat(shoppingCart.totalOfItems(), is(1));
        assertThat(shoppingCart.items().get(0).item(), is((Item) meat));
    }

    @Test
    public void shouldAddSpecificQuantityOfItems() {
        shoppingCart.add(2, meat).add(1, beer);

        assertThat(shoppingCart.totalOfItems(), is(3));
    }

    @Test
    public void shouldKnowItsTotalBaseOnTheItemsInside() {
        shoppingCart.add(meat).add(beer);

        assertThat(shoppingCart.total(), is(6f));
    }
}
