package puc.tdd.shoppingCart;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BeerTest {
    @Test
    public void shouldCost1Dollar() {
        assertThat(new Beer().price(), is(1f));
    }
}
