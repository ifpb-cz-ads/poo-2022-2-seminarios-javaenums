import java.util.List;
import java.util.ArrayList;

public class LojaTeste {
    public static void main(String[] args) {
        Chinelo apercata = new Chinelo("Apercata", true, CorDaRoupa.verde, 20, .13, "Borracha", 25, 45);
        System.out.println(apercata.roupaInfo());

        System.out.printf("%n%.2f", apercata.calculaPreco("45"));

        List<String> tamanhos = new ArrayList<>();
        tamanhos.add("PP");
        tamanhos.add("P");
        tamanhos.add("M");
        tamanhos.add("G");


        Roupa regata = new Camisa("Regata", tamanhos, false, CorDaRoupa.azul, 35.5, .15, "sem manga", false);

        System.out.println("\n" + regata.roupaInfo());

        System.out.printf("%n%.2f", regata.calculaPreco("M"));
    }   
}
