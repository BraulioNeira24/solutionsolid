public class Pokemon {
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

    public void ataque(){
        if (tipo == "tierra"){
            //Código ataque tierra
        }else if(tipo == "agua"){
            //Código ataque agua
        }else if (tipo == "electrico"){
            //Código ataque eléctrico
        }else if (tipo == "roca"){
            //Código ataque roca
        }else if (tipo == "normal"){
            //Código ataque normal
        }
    
    }

    public void evolucionar(){
        System.out.println(this.nombre + " ha evolucionado");
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }
    
}