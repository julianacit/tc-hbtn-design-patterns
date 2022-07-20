import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebida) {
        super(bebida);
    }

    public List<String> obterIngredientes() {
        List<String> lista = this.getBebidaDecorada().obterIngredientes();
        lista.add("acucar");
        return lista;
    }

    public double obterPreco() {
        return this.getBebidaDecorada().obterPreco() + 1.9;
    }
}