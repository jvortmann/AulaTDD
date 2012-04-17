package puc.tdd.carrinho;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarneTest {
    @Test
    public void deveCustar5Reais() {
        assertThat(new Carne().preco(), is(5f));
    }
}
