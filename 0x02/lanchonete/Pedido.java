import java.util.*;

public class Pedido {
    private HashSet<ItemPedido> itensDentroDaCaixa = new HashSet<ItemPedido>();
    private HashSet<ItemPedido> itensForaDaCaixa = new HashSet<ItemPedido>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroDaCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaDaCaixa.add(item);
    }

    @Override
    public String toString() {
        String retorno = "Fora da caixa:";
        for (ItemPedido item: itensForaDaCaixa) {
            retorno += "\n\t- " + item.getTipo() + " " + item.getNome();
        }
        retorno += "\nDentro da caixa:";
        for (ItemPedido item: itensDentroDaCaixa) {
            retorno += "\n\t- " + item.getTipo() + " " + item.getNome();
        }
        return retorno;
    }
}