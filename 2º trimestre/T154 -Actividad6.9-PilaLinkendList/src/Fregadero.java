import java.util.LinkedList;

public class Fregadero {
    private LinkedList <Plato> platos;            // <<R>>

    public Fregadero() {
       platos = new LinkedList<>();
    }

    /**
     * Metodo que introduce un plato en el regadero
     * @param p
     */

    public void meter(Plato p) {
        assert p != null : "Error: el plato a meter no puede ser nulo";
        platos.push(p);
    }

    /**
     * Metodo que friega un plato y lo saca del fregadero
     */
    public void fregar() {
      platos.pop();
    }

    /**
     * Metodo que muestra una lista de platos a fregar
     */
    public void mostrar() {
        for (Plato p : platos) {
            System.out.println(p);
        }
    }
}
