import java.util.List;

public abstract class Roupa {

    public String nome;
    public List<String> tamanhos;
    public CorDaRoupa corDaRoupa;
    public Boolean estampa;
    public double precoMin;
    public double fator;

    public Roupa(String nome, List<String> tamanhos, Boolean estampa, CorDaRoupa corDaRoupa, double precoMin, double fator) {
        this.nome = nome;
        this.tamanhos = tamanhos;
        this.estampa = estampa;
        this.corDaRoupa = corDaRoupa;
        this.precoMin = precoMin;
        this.fator = fator;
    }

    public double calculaPreco(String tamanho) {
        int fatorTamanho = 0;
        for (int i = 0; i < tamanhos.size(); i++) {
            if (tamanhos.get(i).equals(tamanho)) {
                fatorTamanho += i;
                break;
            }
        }

        return precoMin * (1 + (fatorTamanho * fator));
    }

    public String roupaInfo() {
        String temEstampa;
        if (estampa) temEstampa = "sim";
        else temEstampa = "não";

        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s%nPreço mínimo: %.2f",
                nome, tamanhos, corDaRoupa, temEstampa, precoMin);
    }
}
