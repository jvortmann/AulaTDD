package puc.tdd.carrinho;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarrinhoDeComprasTest {
    private CarrinhoDeCompras carrinho;
    private Carne carne;
    private Cerveja cerveja;

    @Before
    public void setUp() throws Exception {
        carrinho = new CarrinhoDeCompras();
        carne = new Carne();
        cerveja = new Cerveja();
    }

    @Test
    public void deveAdicionarItemAoCarrinho() {
        carrinho.adiciona(carne);

        assertThat(carrinho.totalDeItens(), is(1));
        assertThat(carrinho.itens().get(0).item(), is((Item) carne));
    }

    @Test
    public void devePoderAdicionarQuantidadesEspecificasDeItens() {
        carrinho.adiciona(2, carne).adiciona(1, cerveja);

        assertThat(carrinho.totalDeItens(), is(3));
    }

    @Test
    public void deveTerOTotalDosItensAdicionados() {
        carrinho.adiciona(carne).adiciona(cerveja);

        assertThat(carrinho.total(), is(6f));
    }
}
