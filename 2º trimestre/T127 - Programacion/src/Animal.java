public class Animal {


    private String nombre;

    public Animal(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error: el nombre introducido no puede ser null";
        assert !nombre.isEmpty() : "Error: el nombre introducido no puede estar vacio";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
