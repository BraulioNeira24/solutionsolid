package ec.edu.espol.Seccion1.DIP;

public class Reproductor {
    private FormatoAudio formato;

    public Reproductor(FormatoAudio formato) {
        this.formato = formato;
    }

    public void reproducirArchivo(String archivo) {
        formato.reproducir(archivo);
    }
}

