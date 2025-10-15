package ec.edu.espol.Seccion1.LSP;

public class Lista extends ColeccionPython implements Mutable {

    @Override
    public void agregarElemento(){
        System.out.println("Se ha agregado elemento a la lista");
    }

    @Override
    public void mostrarElementos(){
        System.out.println("Mostrando elementos de la lista");
    }

}
