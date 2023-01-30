import java.util.List;

public class Camisa extends Roupa{
    public String manga;
    public boolean gola;

    public Camisa(String nome, List<String> tamanhos, Boolean espampa, CorDaRoupa corDaRoupa, String manga, boolean gola) {
        super(nome, tamanhos, espampa, corDaRoupa);
        this.manga = manga;
        this.gola = gola;
    }

    @Override
    public String roupaInfo() {
        String temEstampa;
        String golaAlta;
        if (espampa) temEstampa = "sim";
        else temEstampa = "não";

        if (gola) golaAlta = "sim";
        else golaAlta = "não";

        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s%nManga: %s%nGola alta: %s",
                nome, tamanhos, corDaRoupa, temEstampa, manga, golaAlta);
    }
}
