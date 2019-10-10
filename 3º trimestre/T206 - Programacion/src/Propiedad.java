import java.io.Serializable;

public class Propiedad implements  Serializable {

    private String nombre;                                  // NO NULO, NO VACIO
    private String valor;
    private String descripcion;                             // NO NULO, NO VACIO


    public Propiedad(String nombre, String descripcion) {
        setNombre(nombre);
        setDescripcion(descripcion);
        setValor();
    }

    public void setNombre(String nombre) {
        if (nombre == null)
            throw new NullPointerException("Error: el nombre recibido no puede ser nulo");
        if (nombre.isEmpty())
            throw new IllegalArgumentException("Error: el nombre recibido no puede estar vacio");

        this.nombre = nombre;
    }

    public void setValor() {
        this.valor = System.getProperty(this.nombre);
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null)
            throw new NullPointerException("Error: la descripción recibida no puede ser nulo");
        if (descripcion.isEmpty())
            throw new IllegalArgumentException("Error: la descripción recibida no puede estar vacio");

        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
