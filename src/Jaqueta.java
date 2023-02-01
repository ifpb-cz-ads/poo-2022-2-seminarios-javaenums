import java.util.List;

public class Jaqueta extends Roupa{
    public String manga;
    
    public Jaqueta(String nome, List<String> tamanhos, Boolean espampa, CorDaRoupa corDaRoupa, String manga,
    double  precoMin, double fator) {
        super(nome, tamanhos, espampa, corDaRoupa,precoMin,fator);
        this.manga = manga;
    }
    public String roupaInfo(){
        String temEstampa;
        if (estampa) temEstampa = "sim";
        else temEstampa = "não";
        
        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s%nManga: %s%nPreço mínimo: %.2f",
                nome, tamanhos, corDaRoupa, temEstampa, manga,precoMin);
    }
    
 }