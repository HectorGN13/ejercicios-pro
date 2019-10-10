import java.util.EventObject;

public class EventoFormulario extends EventObject {

    private String nombre;
    private String puesto;
    private int categoriaEdad;
    private String categoriaEmp;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public EventoFormulario(Object source) {
        super(source);
    }

    public EventoFormulario(Object source, String nombre, String puesto, int categoriaEdad, String categoriaEmp) {
        super(source);
        setNombre(nombre);
        setPuesto(puesto);
        setCategoriaEdad(categoriaEdad);
        setCategoriaEmp(categoriaEmp);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getCategoriaEdad() {
        return categoriaEdad;
    }

    public String getCategoriaEmp() {
        return categoriaEmp;
    }

    public void setCategoriaEdad(int categoriaEdad) {
        this.categoriaEdad = categoriaEdad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setCategoriaEmp(String categoriaEmp) {
        this.categoriaEmp = categoriaEmp;
    }
}
