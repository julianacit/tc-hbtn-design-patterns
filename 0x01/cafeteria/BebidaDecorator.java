import java.util.List;

public class BebidaDecorator extends Bebida{
    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        bebidaDecorada = bebida;
    }
    public List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }
    public double obterPreco() {
        return bebidaDecorada.obterPreco();
    }

    public Bebida getBebidaDecorada() {
        return bebidaDecorada;
    }

    public void setBebidaDecorada(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }
}