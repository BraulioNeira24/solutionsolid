public class Arquero implements Jugador {

    @Override
    public void ataqueCuerpoACuerpo() {
        System.out.println("Arquero golpea con daga");
    }

    @Override
    public void ataqueADistancia() {
        System.out.println("Arquero dispara flecha");
    }

    @Override
    public void ataqueMagico() {
        throw new UnsupportedOperationException("Arquero no puede usar magia");
    }
}

