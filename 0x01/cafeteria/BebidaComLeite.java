import java.util.List;

public class BebidaComLeite extends BebidaDecorator{
    public BebidaComLeite(Bebida bebida) {
        super(bebida);
    }

    public List<String> obterIngredientes() {
        List<String> lista = bebidaDecorada.obterIngredientes();
        lista.add("cafe");
        return lista;
    }
    public double obterPreco() {
        return bebidaDecorada.obterPreco() + 3.2;
    }
}