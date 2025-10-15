public class Mago implements Jugador {

    @Override
    public void ataqueCuerpoACuerpo() {
        System.out.println("Mago no puede atacar cuerpo a cuerpo");
    }

    @Override
    public void ataqueADistancia() {
        System.out.println("Mago lanza hechizo a distancia");
    }

    @Override
    public void ataqueMagico() {
        System.out.println("Mago lanza hechizo mágico");
    }
}