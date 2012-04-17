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
        Carne carne = new Carne();
        carrinho.adiciona(carne);

        assertThat(carrinho.itens().size(), is(1));
        assertThat(carrinho.itens().get(0), is(carne));
    }

    @Test
    public void deveTerOTotalDosItensAdicionados() {
        carrinho.adiciona(new Carne());
        carrinho.adiciona(new Carne());

        assertThat(carrinho.total(), is(10f));
    }
}
