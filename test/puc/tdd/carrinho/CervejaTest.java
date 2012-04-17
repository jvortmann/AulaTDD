package puc.tdd.carrinho;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CervejaTest {
    @Test
    public void deveCustar1Real() {
        assertThat(new Cerveja().preco(), is(1f));
    }
}
