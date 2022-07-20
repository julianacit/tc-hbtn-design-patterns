public abstract class Personagem {
    protected String nome;
    protected TipoPersonagem tipo;
    protected int inteligencia;
    protected int forca;
    protected int vigor;
    protected int resistencia;
    protected int destreza;

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public abstract double getDanoAtaque();

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("Personagem { nome = %s, tipo = %s, inteligencia = %d, forca = %d, vigor = %d, " +
                "resistencia = %d, destreza = %d, dano ataque = %.2f }", this.nome, this.tipo, this.inteligencia,
                this.forca, this.vigor, this.resistencia, this.destreza, this.getDanoAtaque());
    }
}