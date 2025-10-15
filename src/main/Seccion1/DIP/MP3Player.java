public class MP3Player implements FormatoAudio {
    @Override
    public void reproducir(String archivo) {
        System.out.println("Reproduciendo MP3: " + archivo);
    }
}
