import java.util.List;

public abstract class Roupa {

    public String nome;
    public List<String> tamanhos;
    public CorDaRoupa corDaRoupa;
    public Boolean espampa;

    public Roupa(String nome, List<String> tamanhos, Boolean espampa, CorDaRoupa corDaRoupa) {
        this.nome = nome;
        this.tamanhos = tamanhos;
        this.espampa = espampa;
        this.corDaRoupa = corDaRoupa;
    }

    public String roupaInfo() {
        String temEstampa;
        if (espampa) temEstampa = "sim";
        else temEstampa = "não";

        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s",
                nome, tamanhos, corDaRoupa, temEstampa);
    }
}
