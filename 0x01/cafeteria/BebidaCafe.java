import java.util.*;

public class BebidaCafe extends Bebida{
    public List<String> obterIngredientes() {
        List<String> lista = new ArrayList<>();
        lista.add("cafe");
        return lista;
    }
    public double obterPreco() {
        return 5.35;
    }
}