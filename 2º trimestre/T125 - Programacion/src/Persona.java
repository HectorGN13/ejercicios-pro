public class Persona {

    private String nombre;

    public Persona(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error el nombre no puede ser null";
        assert !nombre.isEmpty() : "Error el nombre no puede estar vacio";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
