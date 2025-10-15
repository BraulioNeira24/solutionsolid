public class Main {
    public static void main(String[] args) {
       
        Reproductor mp3 = new Reproductor(new MP3Player());
        Reproductor wav = new Reproductor(new WAVPlayer());
        Reproductor flac = new Reproductor(new FLACPlayer());

        mp3.reproducirArchivo("musica.mp3");
        wav.reproducirArchivo("melodia.wav");
        flac.reproducirArchivo("cancion.flac");
    }
}
