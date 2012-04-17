package puc.tdd.carrinho;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarrinhoDeComprasTest {
    private CarrinhoDeCompras carrinho;

    @Before
    public void setUp() throws Exception {
        carrinho = new CarrinhoDeCompras();
    }

    @Test
    public void deveAdicionarItemAoCarrinho() {
        Item item = new Item();
        carrinho.adiciona(item);

        assertThat(carrinho.itens().size(), is(1));
        assertThat(carrinho.itens().get(0), is(item));
    }

    @Test
    public void deveTerOTotalDosItensAdicionados() {
        carrinho.adiciona(new Item());
        carrinho.adiciona(new Item());

        assertThat(carrinho.total(), is(10f));
    }
}
