package ec.edu.espol.Seccion1.NO_OCP;

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
}