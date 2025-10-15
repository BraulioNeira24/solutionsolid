package ec.edu.espol.Seccion1.NO_ISP;

public class Guerrero implements Jugador {

    @Override
    public void ataqueCuerpoACuerpo() {
        System.out.println("Guerrero ataca con espada");
    }

    @Override
    public void ataqueADistancia() {
        System.out.println("Guerrero no tiene ataque a distancia");
    }

    @Override
    public void ataqueMagico() {
        throw new UnsupportedOperationException("Guerrero no puede usar magia");
    }
}

