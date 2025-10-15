public class Tupla extends ColeccionPython{

    @Override
    public void agregarElemento(){
        throw new UnsupportedOperationException("No se puede agregar elementos a una tupla");
    }

    @Override
    public void mostrarElementos(){
        System.out.println("Mostrando elementos de la tupla");
    }

}
