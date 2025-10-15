package ec.edu.espol.Seccion1.SRP;

public class CentroPokemon {
    public void curarPokemon(Pokemon p){
        p.setVida(p.getVida() + 15);
        System.out.println("El centro Pokémon ha curado a " + p);
    }
    
}

