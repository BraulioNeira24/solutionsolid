package ec.edu.espol.Seccion1.SRP;

public class GimnasioPokemon {
    public void entrenarPokemon(Pokemon p){
        p.setPoder(p.getPoder() + 1);
        System.out.println("El Pokémon " + p + " ha entrenado en el gimnasio");
    }
    
}


