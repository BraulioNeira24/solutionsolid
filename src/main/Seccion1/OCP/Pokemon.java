public abstract class Pokemon {
    private String nombre;
    private int vida;
    private int poder;
    private String tipo;

    public Pokemon(String n, int v, int p, String t){
        this.nombre = n;
        this.vida = v;
        this.poder = p;
        this.tipo = t;
    }

    public abstract void ataque();

    public void evolucionar(){
        System.out.println(this.nombre + " ha evolucionado");
        
        
    }

    //getters y setters
}
