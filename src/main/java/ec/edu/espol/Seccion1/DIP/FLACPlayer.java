package ec.edu.espol.Seccion1.DIP;

public class FLACPlayer implements FormatoAudio {
    @Override
    public void reproducir(String archivo) {
        System.out.println("Reproduciendo FLAC: " + archivo);
    }
}

