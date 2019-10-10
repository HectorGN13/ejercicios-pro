public class Persona {
    private String nombre;
    private String alias;

    public Persona(String nombre, String alias) {
        this.nombre = nombre;
        this.alias = alias;
    }

    private int devuelve(int x, int y){
        return x+y;
    }

    private boolean devuelve(int x, int y){
        return true;
    }

    /*
    No es posible porque entonces cuando llamemos al metodo el programa no sabe identificar a cual de ellos estamos llamando
    por lo tanto nos da un error en tiempo de edicion.
     */
}
