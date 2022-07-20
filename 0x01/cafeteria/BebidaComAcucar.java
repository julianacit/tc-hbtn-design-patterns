import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebida) {
        super(bebida);
    }

    public List<String> obterIngredientes() {
        List<String> lista = bebidaDecorada.obterIngredientes();
        lista.add("acucar");
        return lista;
    }

    public double obterPreco() {
        return bebidaDecorada.obterPreco() + 1.9;
    }
}