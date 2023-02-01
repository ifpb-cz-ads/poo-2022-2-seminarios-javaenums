import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Roupa> estoque = new ArrayList<>();

    public void addItem(Roupa novaRoupa) {
        estoque.add(novaRoupa);
    }

    public void verEstoque() {
        for (Roupa roupa: estoque) {
            System.out.printf("%n%d%s%n", estoque.indexOf(roupa) + 1, roupa.roupaInfo());
        }
    }
}
