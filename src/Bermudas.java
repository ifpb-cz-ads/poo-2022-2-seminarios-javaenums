

import java.util.List;

public class Bermudas extends Roupa {
   
    public boolean bolso;
    public String genero;

    

    public Bermudas(String nome, List<String> tamanhos, Boolean estampa, CorDaRoupa corDaRoupa, double precoMin,
            double fator, boolean bolso, String genero) {
        super(nome, tamanhos, estampa, corDaRoupa, precoMin, fator);
        this.bolso = bolso;
        this.genero = genero;
    }



    @Override
    public String roupaInfo(){
        String temEstampa;
        String temBolso;
        if (estampa) temEstampa = "sim";
        else temEstampa = "não";
        
        if (bolso) temBolso = "sim";
        else temBolso = "não";
        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s%nBolso: %s%nGenero: %s%nPreço mínimo: %.2f",
        nome, tamanhos, corDaRoupa, temEstampa, temBolso, genero, precoMin);

    }
}
