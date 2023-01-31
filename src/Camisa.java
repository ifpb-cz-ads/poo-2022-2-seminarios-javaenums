package src;

import java.util.List;

public class Camisa extends Roupa{
    public String manga;
    public boolean gola;

    public Camisa(String nome, List<String> tamanhos, Boolean estampa, CorDaRoupa corDaRoupa, double precoMin, double fator, String manga, boolean gola) {
        super(nome, tamanhos, estampa, corDaRoupa, precoMin, fator);
        this.manga = manga;
        this.gola = gola;
    }

    @Override
    public String roupaInfo() {
        String temEstampa;
        String golaAlta;
        if (estampa) temEstampa = "sim";
        else temEstampa = "não";

        if (gola) golaAlta = "sim";
        else golaAlta = "não";

        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s%nManga: %s%nGola alta: %s%nPreço mínimo: %.2f",
                nome, tamanhos, corDaRoupa, temEstampa, manga, golaAlta, precoMin);
    }
}
