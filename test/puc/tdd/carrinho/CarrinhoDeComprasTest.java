package puc.tdd.carrinho;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarrinhoDeComprasTest {
    @Test
    public void deveAdicionarItemAoCarrinho() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Item item = new Item();
        carrinho.adiciona(item);

        assertThat(carrinho.itens().size(), is(1));
        assertThat(carrinho.itens().get(0), is(item));
    }
}
