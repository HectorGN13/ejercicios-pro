import java.util.EventObject;

public class EventoFormulario extends EventObject {

    private String nombre;
    private String puesto;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public EventoFormulario(Object source) {
        super(source);
    }

    public EventoFormulario(Object source, String nombre, String puesto) {
        super(source);
        setNombre(nombre);
        setPuesto(puesto);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
