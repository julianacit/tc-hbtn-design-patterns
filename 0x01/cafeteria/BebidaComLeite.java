import java.util.List;

public class BebidaComLeite extends BebidaDecorator{
    public BebidaComLeite(Bebida bebida) {
        super(bebida);
    }

    public List<String> obterIngredientes() {
        List<String> lista = this.getBebidaDecorada().obterIngredientes();
        lista.add("leite");
        return lista;
    }
    public double obterPreco() {
        return this.getBebidaDecorada().obterPreco() + 3.2;
    }
}