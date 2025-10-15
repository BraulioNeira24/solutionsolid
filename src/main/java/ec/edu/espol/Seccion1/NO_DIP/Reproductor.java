public class Reproductor {
    private MP3Player mp3Player = new MP3Player();

    public void reproducir(String archivo) {
        mp3Player.reproducirMP3(archivo);
    }
}