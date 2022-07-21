public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanho, int total, int coloridas, boolean ehFrenteVerso) {
        return new Impressao(tamanho, total, coloridas, ehFrenteVerso);
    }
}