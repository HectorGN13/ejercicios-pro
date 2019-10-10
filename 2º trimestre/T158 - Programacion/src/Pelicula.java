public class Pelicula {

    private String nombre;
    private int duracion;

    public Pelicula(String nombre, int duracion) {
        setDuracion(duracion);
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error: el nombre no puede ser null";
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        assert duracion > 60 : "Error para ser un largometraje debe tener 60 minutos minimo";
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
