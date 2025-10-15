package ec.edu.espol.Seccion1.DIP;

public class WAVPlayer implements FormatoAudio {
    @Override
    public void reproducir(String archivo) {
        System.out.println("Reproduciendo WAV: " + archivo);
    }
}
