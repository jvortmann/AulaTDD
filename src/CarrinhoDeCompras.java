import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<Item>();

    public List<Item> itens() {
       return itens;
    }

    public void adiciona(Item item) {
        itens.add(item);
    }
}
