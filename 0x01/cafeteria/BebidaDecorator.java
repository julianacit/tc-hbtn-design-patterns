import java.util.List;

public class BebidaDecorator extends Bebida{
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        bebidaDecorada = bebida;
    }
    public List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }
    public double obterPreco() {
        return bebidaDecorada.obterPreco();
    }
}