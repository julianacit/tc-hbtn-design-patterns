public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido = new Pedido();

    public Pedido build() {
        return pedido;
    }

    public void setLanche(TipoLanche tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.LANCHE);
        item.setNome(tipo.toString());
        pedido.adicionarItemDentroCaixa(item);
    }
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BATATA);
        item.setNome(tamanho.toString());
        pedido.adicionarItemDentroCaixa(item);
    }
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BRINDE);
        item.setNome(tipo.toString());
        pedido.adicionarItemDentroCaixa(item);
    }
    public void setBebida(TipoBebida tipo) {
        ItemPedido item = new ItemPedido();
        item.setTipo(TipoItemPedido.BEBIDA);
        item.setNome(tipo.toString());
        pedido.adicionarItemForaCaixa(item);
    }
}