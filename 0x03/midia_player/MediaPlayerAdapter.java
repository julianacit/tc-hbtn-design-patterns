public class MediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (tipoMedia != TipoMedia.MP3) {
            VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();
            advancedMediaPlayer = videoMediaPlayer;
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia == TipoMedia.MP4) {
            advancedMediaPlayer.reproduzirMp4(nomeArquivo);
        } else {
            advancedMediaPlayer.reproduzirVlc(nomeArquivo);
        }
    }
}