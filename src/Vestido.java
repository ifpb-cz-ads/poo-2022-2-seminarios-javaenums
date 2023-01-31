package src;
import java.util.List;

public class Vestido extends Roupa{
    public String tamanhoSaia;
    public String manga;
    
    public Vestido(String nome, List<String> tamanhos, Boolean espampa, CorDaRoupa corDaRoupa, String tamanhoSaia, String manga,
    double  precoMin, double fator) {
        super(nome, tamanhos, espampa, corDaRoupa,precoMin,fator);
        this.tamanhoSaia = tamanhoSaia;
        this.manga = manga;
    }
    public String roupaInfo(){
        String temEstampa;
        if (estampa) temEstampa = "sim";
        else temEstampa = "não";
        
        return String.format("- %s%nTamanhos disponíveis: %s%nCor da roupa: %s%nEstampa: %s%nManga: %s%nTamanho da saia: %s%nPreço mínimo: %.2f",
                nome, tamanhos, corDaRoupa, temEstampa, manga, tamanhoSaia,precoMin);
    }
    
 }


