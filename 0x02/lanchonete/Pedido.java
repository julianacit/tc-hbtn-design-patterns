import java.util.*;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<ItemPedido>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<ItemPedido>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String retorno = "\tFora da caixa:";
        for (ItemPedido item: itensForaCaixa) {
            retorno += "\n\t\t- " + item.getTipo() + " " + item.getNome();
        }
        retorno += "\n\tDentro da caixa:";
        for (ItemPedido item: itensDentroCaixa) {
            retorno += "\n\t\t- " + item.getTipo() + " " + item.getNome();
        }
        return retorno;
    }
}