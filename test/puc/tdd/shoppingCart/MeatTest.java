package puc.tdd.shoppingCart;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MeatTest {
    @Test
    public void shouldCost5Dollars() {
        assertThat(new Meat().price(), is(5f));
    }
}
