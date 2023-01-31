import java.util.ArrayList;
import java.util.List;

public class Chinelo extends Roupa {

    public String material;


    private List<String> calcularTamanhos(int tamMin, int tamMax) {
        List<String> resultado = new ArrayList<>();
        for (int i = tamMin; i <= tamMax; i++) {
            resultado.add(Integer.toString(i));
        }
        return resultado;
    }

    public Chinelo(String nome, Boolean espampa, CorDaRoupa corDaRoupa, double precoMin, double fator, String material, int tamMin, int tamMax) {
        super(nome, null, espampa, corDaRoupa, precoMin, fator);
        super.tamanhos = calcularTamanhos(tamMin, tamMax);
        this.material = material;
    }

    @Override
    public String roupaInfo() {

        String temEstampa;

        if (espampa) temEstampa = "sim";
        else temEstampa = "não";

        return String.format("- %s%nTamanhos disponíveis: %s%nCor do chinelo: %s%nEstampa: %s%nPreço mínimo: %.2f",
                nome, tamanhos, corDaRoupa, temEstampa, precoMin);
    }
}
