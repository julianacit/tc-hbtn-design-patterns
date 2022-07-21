public class Impressao {

    private TamanhoImpressao tamanhoImpressao;
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal() {
        switch (tamanhoImpressao) {
            case A2:
                valorColoridasFrenteVerso = 0.28;
                valorPretoBrancoFrenteVerso = 0.18;
                valorColoridasFrenteApenas = 0.32;
                valorPretoBrancoFrenteApenas = 0.22;
                break;
            case A3:
                valorColoridasFrenteVerso = 0.25;
                valorPretoBrancoFrenteVerso = 0.15;
                valorColoridasFrenteApenas = 0.3;
                valorPretoBrancoFrenteApenas = 0.2;
                break;
            case A4:
                valorColoridasFrenteVerso = 0.2;
                valorPretoBrancoFrenteVerso = 0.1;
                valorColoridasFrenteApenas = 0.25;
                valorPretoBrancoFrenteApenas = 0.15;
                break;
        }

        int paginasPretoBranco = paginasTotais - paginasColoridas;
        return (ehFrenteVerso ? valorColoridasFrenteVerso * paginasColoridas + valorPretoBrancoFrenteVerso * paginasPretoBranco
                : valorColoridasFrenteApenas * paginasColoridas + valorPretoBrancoFrenteApenas * paginasPretoBranco);
    }

    @Override
    public String toString() {
        int paginasPretoBranco = paginasTotais - paginasColoridas;
        String retorno = String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, paginasPretoBranco,
                (ehFrenteVerso ? "frente e verso" : "frente apenas"),
                calcularTotal()
        );

        return retorno;
    }
}