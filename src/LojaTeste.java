import java.util.List;
import java.util.ArrayList;

public class LojaTeste {
    public static void main(String[] args) {
        Chinelo apercata = new Chinelo("Apercata", true, CorDaRoupa.VERDE, 20, .13, "Borracha", 25, 45);
        System.out.println(apercata.roupaInfo());

        System.out.printf("%n%.2f", apercata.calculaPreco("45"));

        List<String> tamanhos = new ArrayList<>();
        tamanhos.add("PP");
        tamanhos.add("P");
        tamanhos.add("M");
        tamanhos.add("G");


        Roupa vestido = new Vestido("Vestido Longo", tamanhos, false, CorDaRoupa.PRETO,50, .20, "longa" ,"sem manga");

        System.out.println("\n" + vestido.roupaInfo());
        String tamanhoVestido = "G";
        System.out.printf("%nPreço tamanho %s: R$%.2f", tamanhoVestido,vestido.calculaPreco(tamanhoVestido));

        List<String> tamanhosBermuda = new ArrayList<>();
        tamanhosBermuda.add("PP");
        tamanhosBermuda.add("P");
        tamanhosBermuda.add("M");
        tamanhosBermuda.add("G");

        Roupa bermuda = new Bermudas("Shorts Listrado", tamanhosBermuda, true, CorDaRoupa.CINZA, 20, .13, true, "masculino");

        System.out.println("\n" + bermuda.roupaInfo());
        System.out.printf("%nPreço tamanho %s: R$%.2f", tamanhoVestido, bermuda.calculaPreco(tamanhoVestido));
    }
}
