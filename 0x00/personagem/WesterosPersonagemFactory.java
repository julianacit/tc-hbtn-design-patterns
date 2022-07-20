public class  WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) {
        if (tipo == TipoPersonagem.MAGO) {
            return new Mago("Mago", 8, 3, 3, 3, 4);
        }
        if (tipo == TipoPersonagem.LADRAO){
            return new Ladrao("Ladrao", 1, 8, 7, 7, 10);
        }
        if (tipo == TipoPersonagem.GUERREIRO) {
            return new Guerreiro("Guerreiro", 0, 9, 7, 10, 7);
        }
        return null;
    }
}