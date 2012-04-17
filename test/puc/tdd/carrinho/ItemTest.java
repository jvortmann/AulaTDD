package puc.tdd.carrinho;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void deveCustar5Reais() {
        assertThat(new Item().preco(), is(5f));
    }
}
