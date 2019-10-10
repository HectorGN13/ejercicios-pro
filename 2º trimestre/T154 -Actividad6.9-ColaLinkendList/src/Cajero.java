import java.util.LinkedList;

public class Cajero {
    private LinkedList <Persona> personas;            // <<R>>

    public Cajero() {
       personas = new LinkedList<>();
    }

    /**
     * Metodo que introduce un plato en el regadero
     * @param p
     */

    public void quierePagar(Persona p) {
        assert p != null : "Error: la persona recibida no puede ser nulo";
        personas.addLast(p);
    }

    /**
     * Metodo que friega un plato y lo saca del fregadero
     */
    public void pagar() {
      personas.pollFirst();
    }

    public Persona siguiente() {
        return personas.peek();
    }

    /**
     * Metodo que muestra una lista de personas a fregar
     */
    public void mostrar() {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
