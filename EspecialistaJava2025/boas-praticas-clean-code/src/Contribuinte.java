public class Contribuinte {

    public static final int TEMPO_MINIMO_APOSENTADORIA = 65;
    int idade;
    int tempoContribuicaoEmAnos;

    boolean estaElegivelParaAposentadoria(){
        return idade >= TEMPO_MINIMO_APOSENTADORIA;
    }
}
